fun main(args: Array<String>) {
  //program kalkulator dengan kotlin

//meminta input user
 println("Masukan bilangan pertama: ")
  var x: Int = readLine()!!.toInt()
 println("Masukan bilangan kedua: ")
  var y: Int = readLine()!!.toInt()
  
 println("> + : menjumlahkan ")
 println("> - : mengurangi ")
 println("> * : mengalikan ")
 println("> / : membagi ")
 println("Masukan operasi yang diinginkan ")
 
 
 var operasi = readLine()
 
 //proses perhitungan dengan "when"
 var hasil = when(operasi){
   "+" -> x + y
   "-" -> x - y
   "/" -> x / y
  else -> x * y
 }
 println("Hasilnya dari : "+ x +" "+operasi+ " "+ y +" adalah : " + hasil)
 
  
  
}