import org.myapp.MyLib
import org.myapp.MyCallBack
import org.myapp.App

fun main(args: Array<String>) {
   System.out?.println("Hello")

   MyLib.INSTANCE?.register_callback(MyCallBack());
   System.out?.println(MyLib.INSTANCE?.calculate_str_len("string for calculation"))

   System.out?.println(MyLib.INSTANCE?.get_one())
   System.out?.println(App().get2())
}