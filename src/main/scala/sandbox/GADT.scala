package sandbox

object GADT {

  sealed trait Expr[T]
  case class IntExpr(i: Int) extends Expr[Int]
  case class BoolExpr(b: Boolean) extends Expr[Boolean]

  def eval[T](e: Expr[T]): T = e match {
    case IntExpr(i) => i
    case BoolExpr(b) => b
  }

}

