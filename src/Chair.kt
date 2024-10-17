class Chair(material: String) : Furniture(material) {
    override fun create() :Int{
        return 1
    }
}