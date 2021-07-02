package com.example.courses.ui.adapters
class HomeRecyclerAdapter() : RecyclerView.Adapter<RecyclerParentAdapter.ParentViewHolder>() {
    private val fieldGroups = mutableListOf<MutableList<FieldData>>()

    private val finalList = mutableListOf<MutableList<FieldData>>()

    private val viewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerParentAdapter.ParentViewHolder {
        val cardView =
            RecyclerChildBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ParentViewHolder(cardView)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val childLayoutManager = LinearLayoutManager(holder.recycler.context)
        holder.recycler.apply {
            layoutManager = childLayoutManager
            adapter = RecyclerChildAdapter(fieldGroups[position])
            setRecycledViewPool(viewPool)
        }
    }

    override fun getItemCount() = fieldGroups.size

    inner class ParentViewHolder(binding: RecyclerChildBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var recycler: RecyclerView = binding.childRecycler
    }

    fun setData(fieldGroups: MutableList<MutableList<FieldData>>) : MutableList<MutableList<FieldData>> {
        this.fieldGroups.clear()
        this.fieldGroups.addAll(fieldGroups)
        notifyDataSetChanged()
        finalList.addAll(fieldGroups)
        return finalList
    }

}