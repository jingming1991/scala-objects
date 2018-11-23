/**
  * object has a dual meaning in Scala
  * 1.refer to an instance of a class
  * 2.keyword
  *
  * launching an application with an Object
  * 1.extend App
  * 2.main()
  *
  * Singletons
  * - creating utility methods object.method
  *
  * Companion Objects
  * class + object in a same file.scala
  *
  * without using the new keyword
  * - Companion Objects
  * - Case Class
  */
object BaseObject extends App {
  /**
    * Object Casting when creating objects dynamically
    * method : asInstanceOf
    * example : using in Spring Framework
    *
    * interact with Java and send it an Array of Object
    */
  def fakeCasting(): Unit = {
    //  var ctx = getSpringApplicationContext()
    //  ctx.getBean("BeanName").asInstanceOf[ClassName]
    println("get Bean from Spring Framework")

    val i: Int = 1
    println(i.asInstanceOf[String])

    val array = Array("123", 123)
    val objects = array.asInstanceOf[Array[Object]]
    //AJavaClass.receive(objects)
  }

  /**
    * when you want to learn about the types Scala
    * is automatically assigning on your behalf
    * call the getClass method on the object
    */
  def getObjectClass(): Unit = {
    printAll("1", "2")
    printAll()
    printXmlItems()
  }

  def printAll(stirngs: String*): Unit = {
    println(s"class+${stirngs.getClass}")
  }

  def printXmlItems(): Unit = {
    val hello = <p>hello,world</p>
    println(s"$hello + ${hello.getClass}")
    hello.child.foreach(e => println(s"$e : ${e.getClass}"))
    val helloBr = <p>hello,
      <br/>
      world</p>
    helloBr.child.foreach(e => println(s"$e : ${e.getClass}"))
  }


}








