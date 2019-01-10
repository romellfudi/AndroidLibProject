package {{ cookiecutter.lib_package_name }};

import android.content.Context;
import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.doAnswer;

@RunWith(PowerMockRunner.class)
public class ExampleUnitTest {
    @Mock
    Context context;

    @Mock
    SharedPreferences prefs;

    @Mock
    SharedPreferences.Editor editor;
    @Mock
    SharedPreferences.Editor editor2;

    @Captor
    ArgumentCaptor<String> keyCaptor, JSONvalueCaptor;

    AtomicInteger atomicInteger = new AtomicInteger(0);

    AtomicReference atomicReference = new AtomicReference();

    @Mock
    APICache apiCache;

    @Before
    public void prepareMocks() {
        when(context.getPackageName()).thenReturn(getClass().getPackage().toString());
        when(context.getSharedPreferences(any(String.class), any(Integer.class)))
                .thenReturn(prefs);
        when(prefs.edit()).thenReturn(editor);
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                atomicInteger.set(Integer.parseInt(invocation.getArguments()[1].toString()));
                return editor;
            }
        }).when(editor).putInt(any(String.class),any(Integer.class));
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return atomicInteger.get();
            }
        }).when(prefs).getInt(any(String.class),anyInt());
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                atomicReference.set(invocation.getArguments()[1].toString());
                return editor;
            }
        }).when(editor).putString(any(String.class),any(String.class));
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return atomicReference.get();
            }
        }).when(prefs).getString(any(String.class),any(String.class));
        when(prefs.edit()).thenReturn(editor);
        when(editor.clear()).thenReturn(editor2);
        when(context.getSharedPreferences(any(String.class),anyInt())).thenReturn(prefs);
    }

    @Test
    public void my_test() {
        Integer valueInt = 123456;
        String valueString = "123456789064yrhgnteydgftvhb!}%&&/()=";
        APICache apiCache = APICache.getInstance(context);
        apiCache.setValue(valueInt);
        assertThat(apiCache.getValue().get(),is(valueInt));
        apiCache.setData(valueString);
        assertThat(apiCache.getData().toString(),is(valueString));

    }

}