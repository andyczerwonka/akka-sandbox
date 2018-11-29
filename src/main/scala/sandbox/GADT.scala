package sandbox

class GADT {

  sealed trait Expr[T]
  case class IntExpr(i: Int) extends Expr[Int]
  case class BoolExpr(b: Boolean) extends Expr[Boolean]

}
