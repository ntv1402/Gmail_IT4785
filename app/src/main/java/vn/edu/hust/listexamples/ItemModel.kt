package vn.edu.hust.listexamples

data class ItemModel(val caption: String, val imageThumb: Int, val imageLarge: Int = 0) {
    var selected: Boolean = false
}
