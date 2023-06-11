

let hTotal = document.getElementById("total")
let hCalcular = document.getElementById("calcular")
let hResultado = document.getElementById("resultado")

function presupuesto() {
    let total = parseFloat(hTotal.value)
    let operacion1 = total * 0.5
    let operacion2 = total * 0.3
    let operacion3 = total * 0.2
    hResultado.innerText = "Para gastos necesarios: " + operacion1 + "\n" +
        "Para gastos opcionales: " + operacion2 + "\n" +
        "Para ahorros e inversiones: " + operacion3
}

hCalcular.addEventListener("click", presupuesto)

