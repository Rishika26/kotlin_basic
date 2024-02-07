package intro.examples
fun si(p: Int, r: Float, t:Int=5):Float {
    return p * r * t / 100
}


fun area(r:Float):Float = 3.14f * r * r

fun main(){
    println(si(2000,1.11f))
    println(si(2000,1.11f,15))
    println(area(4f))
}