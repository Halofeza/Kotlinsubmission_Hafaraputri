package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

    println("Masukan angka pertama yang akan di kali = ")
    var pertama = readLine()
    println("angka pertama anda adalah = $pertama, Masukan angka kedua yang akan di kali = ")
    var kedua = readLine()

    try {
        val result = Integer.valueOf(pertama) * Integer.valueOf(kedua)
        println("The result is: $result")

    } catch (e: Exception) {
        println("Error occurred: ${e.message}")
    }



}