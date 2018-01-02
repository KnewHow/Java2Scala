package towTraitWithSameAbstractMehtod

class ImplementClass extends Trait_One  with Trait_Two {
  override def say(): String = {
    println("lala")
    "yuanguohao"
  }
}
