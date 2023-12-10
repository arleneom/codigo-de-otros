// se crea carpeta assets e img para darle mayor estructura, 
//se cambian las direcciones de img en el array

const productos = [
  {nombre: "Zapato negro", tipo: "zapato", color: "negro", img: "./assets/img/taco-negro.jpg"},
  {nombre: "Zapato azul", tipo: "zapato", color: "azul", img: "./assets/img/taco-azul.jpg"},
  {nombre: "Bota negra", tipo: "bota", color: "negro", img: "./assets/img/bota-negra.jpg"},
  {nombre: "Bota azul", tipo: "bota", color: "azul", img: "./assets/img/bota-azul.jpg"},
  {nombre: "Zapato rojo", tipo: "zapato", color: "rojo", img: "./assets/img/zapato-rojo.jpg"}
]; // se agrega ;
// cambiar nombres de las variables y cambiarlo en el codigo
const lista = document.getElementsByName("lista-de-productos")[0];// se agrega [0]  para obtener el primer elemento de la colección. 
const input = document.querySelector('.input');
const botonDeFiltro = document.querySelector('button');

for (let i = 0; i < productos.length; i++) {
  var d = document.createElement("div")
  d.classList.add("producto")
  
  var ti = document.createElement("p")
  ti.classList.add("titulo")
  ti.textContent = productos[i].nombre
  
  var imagen = document.createElement("img");
  imagen.setAttribute('src', productos[i].img);
  
  d.appendChild(ti)
  d.appendChild(imagen)
  
  lista.appendChild(d)
}



 // displayProductos(productos)//no existe la funcion 


botonDeFiltro.onclick = function() {
  while (lista.firstChild) {
    lista.removeChild(lista.firstChild);
  }

  const texto = input.value;
  console.log(texto);
  const productosFiltrados = filtrado(productos, texto );

  for (let i = 0; i < productosFiltrados.length; i++) {
    var d = document.createElement("div")
    d.classList.add("producto")
  
    var ti = document.createElement("p")
    ti.classList.add("titulo")
    ti.textContent = productosFiltrados[i].nombre
    
    var imagen = document.createElement("img");
    imagen.setAttribute('src', productosFiltrados[i].img);
  
    d.appendChild(ti)
    d.appendChild(imagen)
  
    lista.appendChild(d)
  }
}


const filtrado = (productos = [], texto) => {
  return productos.filter(item => item.tipo.includes(texto) || item.color.includes(texto));
}


