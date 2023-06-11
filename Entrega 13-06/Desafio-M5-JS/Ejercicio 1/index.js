

let hCostoFijo = document.getElementById("costosFijos")
let hPrecioVenta = document.getElementById("precioVenta")
let hCostoVariable = document.getElementById("costosVariables")
let hCalcular = document.getElementById("calcular")
let hResultado = document.getElementById("resultado")

function puntoEquilibrio() {
    let costoFijo = parseFloat(hCostoFijo.value)
    let precioVenta = parseFloat(hPrecioVenta.value)
    let costoVariable = parseFloat(hCostoVariable.value)
    let resultado = costoFijo / (precioVenta - costoVariable)
    hResultado.innerText = "= " + resultado
}
hCalcular.addEventListener("click", puntoEquilibrio)
