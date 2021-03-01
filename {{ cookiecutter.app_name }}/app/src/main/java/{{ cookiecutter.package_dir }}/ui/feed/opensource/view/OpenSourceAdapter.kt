package {{ cookiecutter.package_name }}.ui.feed.opensource.view

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.net.toUri
import {{ cookiecutter.package_name }}.R
import {{ cookiecutter.package_name }}.data.network.OpenSource
import {{ cookiecutter.package_name }}.util.extension.loadImage
import kotlinx.android.synthetic.main.item_open_source_list.view.*

/**
 *
 * @author {{ cookiecutter.author_name }}
 * @version {{ cookiecutter.version_package_name }} {% now 'local', '%d/%m/%Y' %}
 * @since {{ cookiecutter.version_package_name }}
 */
class OpenSourceAdapter(openSourceListItems: MutableList<OpenSource>) : RecyclerView.Adapter<OpenSourceAdapter.OpenSourceViewHolder>() {

    private val openSourceListItems: MutableList<OpenSource> = openSourceListItems


    override fun getItemCount() = openSourceListItems.size

    override fun onBindViewHolder(holder: OpenSourceViewHolder, position: Int) = holder.run {
        clear()
        onBind(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup , viewType: Int) = OpenSourceViewHolder(LayoutInflater.from(parent?.context)
            .inflate(R.layout.item_open_source_list, parent, false))


    internal fun addOpenSourcesToList(OpenSources: List<OpenSource>) {
        this.openSourceListItems.addAll(OpenSources)
        notifyDataSetChanged()
    }

    inner class OpenSourceViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun clear() {
            itemView.coverImageView.setImageDrawable(null)
            itemView.titleTextView.text = ""
            itemView.contentTextView.text = ""
        }

        fun onBind(position: Int) {
            val (projectUrl, coverImgUrl, title, description) = openSourceListItems[position]

            inflateData(title, description, coverImgUrl)
            setItemClickListener(projectUrl)
        }

        private fun setItemClickListener(projectUrl: String?) {
            itemView.setOnClickListener {
                projectUrl?.let {
                    try {
                        // using "apply" as an example
                        itemView.context.startActivity(Intent().apply {
                            action = Intent.ACTION_VIEW
                            data = it.toUri()
                            addCategory(Intent.CATEGORY_BROWSABLE)
                        })
                    } catch (e: Exception) {
                    }
                }
            }
        }

        private fun inflateData(title: String?, description: String?, coverImgUrl: String?) {
            title?.let { itemView.titleTextView.text = it }
            description?.let { itemView.contentTextView.text = it }
            coverImgUrl?.let {
                itemView.coverImageView.loadImage(it)
            }
        }
    }
}
