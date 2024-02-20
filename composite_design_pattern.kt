import java.util.*

open class FileObject {
    open fun add(a: FileObject) {}
    open fun remove() {}
    open fun delete(a: FileObject) {}
}

class File : FileObject() {
    override fun add(a: FileObject) {
        println("A name was added in the file")
    }
    override fun remove() {
        println("A name was removed from the file")
    }
    override fun delete(a: FileObject) {
        println("A name was deleted from the file")
    }
}

class Copy : FileObject() {
    private val copyFiles = ArrayList<FileObject>()
    
    fun addElement(a: FileObject) {
        copyFiles.add(a)
    }
    override fun add(a: FileObject) {
        println("A name was added in the file")
    }
    override fun remove() {
        println("A name was removed from the file")
    }
    override fun delete(a: FileObject) {
        println("A name was deleted from the file")
    }
}

fun main() {
    val a = File()
    val b = File()
    val allCopy = Copy()
    allCopy.addElement(a)
    allCopy.addElement(b)
    allCopy.add(a)
    a.add(b)
    allCopy.remove()
    b.remove()
}