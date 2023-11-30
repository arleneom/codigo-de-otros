const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const name = document.querySelector('.name'); //hacer el nombre mas lógico en name, blog y location
const blog = document.querySelector('.blog');// llamo utilizando . porque las 3 son clases y esta usando querySelector 
const location = document.querySelector('.location');

function displayUser(username) {
  // cambiar a los nuevos nombres de las variables 
  name.textContent = 'cargando...'; 
  const response = await fetch(`${usersEndpoint}/${username}`); 
  console.log(data);
  name.textContent = '${data.name}';
  blog.textContent = '${data.blog}';
  location.textContent = '${data.location}';
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  name.textContent = `Algo salió mal: ${err}`; // se agrega ;
}

displayUser('stolinski').catch(handleError);