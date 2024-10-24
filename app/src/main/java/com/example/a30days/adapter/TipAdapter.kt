import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a30days.R
import com.example.a30days.model.TipItem

class TipAdapter(private val tipItemList: List<TipItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        private const val VIEW_TYPE_TIP = 1
        private const val VIEW_TYPE_HEADER = 0
    }

    // ViewHolder for the Tip
    class TipViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayNumberTextView: TextView = view.findViewById(R.id.day_number)
        val titleTextView: TextView = view.findViewById(R.id.tip_title)
        val descriptionTextView: TextView = view.findViewById(R.id.tip_description)
        val tipImageView: ImageView = view.findViewById(R.id.tip_image)
    }

    // ViewHolder for the Header
    class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val headerTitleTextView: TextView = view.findViewById(R.id.header_title)
    }

    override fun getItemViewType(position: Int): Int {
        return when (tipItemList[position]) {
            is TipItem.Tip -> VIEW_TYPE_TIP
            is TipItem.SectionHeader -> VIEW_TYPE_HEADER
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_TYPE_TIP) {
            // Inflate tip_item.xml for tips
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.tip_item, parent, false)
            TipViewHolder(view)
        } else {
            // Inflate header_item.xml for section headers
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.header_item, parent, false)
            HeaderViewHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = tipItemList[position]) {
            is TipItem.Tip -> {
                val tipHolder = holder as TipViewHolder
                tipHolder.dayNumberTextView.text = item.day
                tipHolder.titleTextView.text = item.title
                tipHolder.descriptionTextView.text = item.description
                tipHolder.tipImageView.setImageResource(item.imageResId)
            }
            is TipItem.SectionHeader -> {
                val headerHolder = holder as HeaderViewHolder
                headerHolder.headerTitleTextView.text = item.title
            }
        }
    }

    override fun getItemCount(): Int {
        return tipItemList.size
    }
}
