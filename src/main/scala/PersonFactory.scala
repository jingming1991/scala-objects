object PersonFactory {

  def apply(s: String): Person = {
    if (s == "t") new Teacher
    else new Worker
  }
}
