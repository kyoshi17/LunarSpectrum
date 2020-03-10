package Model

class Camara {
    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var peso: Float = 3.5F
    private var color: String = "Negro"

    fun setColor(color: String){
        this.color = color
    }
    fun getColor(): String{
        return this.color;
    }
    fun setPeso(peso: Float){
        this.peso = peso
    }
    fun getPeso(): Float{
        return this.peso;
    }
    fun setResolution(resolution: Int){
        this.resolution = resolution
    }
    fun getResolution(): Int{
        return this.resolution;
    }
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun getCamaraStatus() : String {
        return if (isOn) "Camara is turned" else "camara is off"
    }
}