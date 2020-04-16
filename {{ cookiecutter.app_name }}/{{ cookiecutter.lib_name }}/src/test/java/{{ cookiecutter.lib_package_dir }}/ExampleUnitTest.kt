package {{ cookiecutter.lib_package_name }}

import android.content.Context
import android.content.SharedPreferences
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import io.mockk.impl.annotations.MockK
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters
import org.mockito.Mock
import org.mockito.Mockito.`when`
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicReference

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version 1.0.a {% now 'local', '%d/%m/%Y' %}
 * @since 1.0.a
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class ExampleUnitTest {
    @Mock
    internal val context: Context = mock()
    @MockK
    internal val prefs: SharedPreferences = mock()
    @MockK
    internal val editor: SharedPreferences.Editor = mock()
    @MockK
    internal val editor2: SharedPreferences.Editor = mock()

    val atomicInteger = AtomicInteger(10)
    var atomicReference: AtomicReference<String> = AtomicReference()


    @Before
    fun prepareMocks() {
        `when`(context.packageName).thenReturn(javaClass.getPackage().toString())
        `when`(context.getSharedPreferences(any(), any())).thenReturn(prefs)
        `when`(prefs.edit()).thenReturn(editor)
        whenever(editor.putInt(any(), any())).thenAnswer {
            atomicInteger.set(it.arguments[1].toString().toInt())
            editor
        }
        `when`(prefs.getInt(any(), any())).thenAnswer {
            return@thenAnswer atomicInteger.get()
        }
        whenever(editor.putString(any(), any())).thenAnswer {
            atomicReference.set(it.arguments[1].toString())
            editor
        }
        `when`(prefs.getString(any(), any())).thenAnswer{
            return@thenAnswer atomicReference.get()
        }
        `when`(prefs.edit()).thenReturn(editor)
        `when`(editor.clear()).thenReturn(editor2)
        `when`(context.getSharedPreferences(any(), any())).thenReturn(prefs)
    }

    @Test
    fun my_test() {
        val valueInt = 123456
        val valueString = "123456789064yrhgnteydgftvhb!}%&&/()="
        val apiCache = APICache.getInstance(context)
        apiCache.setValue(valueInt)
        assertThat(apiCache.value.get(), `is`(valueInt))
        apiCache.setData(valueString)
        assertThat(apiCache.data.get(), `is`(valueString))
    }
}