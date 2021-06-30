# Adapter

인터페이스를 다른 인터페이스로 변환하기 위한 용도

# Facade

인터페이스를 단순화 시키기 위한 용도

→ 걍 클래스로 만들어서 집어넣는걸 퍼사드라 하는구나..;;;

안드로이드의 리사이클러 뷰 어댑터

```kotlin
abstract class BaseAdapter<B : ViewDataBinding, T : Any>(
    @LayoutRes private val layoutResId: Int,
    private val bindingVariableId: Int
) : RecyclerView.Adapter<BaseViewHolder<B, T>>() {

    protected var items = mutableListOf<T>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        BaseViewHolder<B, T>(
            layoutResId, parent, bindingVariableId
        )

    // items 에게 호출을 위임하고 있다.
    override fun getItemCount(): Int = items.size

    fun getItem(position: Int) = items[position]

    fun updateItems(data: MutableList<T>) {
        items = data
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: BaseViewHolder<B, T>, position: Int) {
        holder.bind(getItem(position))
    }
}
```
