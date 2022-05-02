// Una vez que este cargada la página
$(document).ready(function() {
    // Carga la Tabla de Usuarios
    cargarUsuarios();
  $('#usersTable').DataTable();
});

// funcion asincrona para cargar la tabla de usuarios
async function cargarUsuarios(){

    // el await espera a que termine la funcion
    const request = await fetch('users', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });

    const users = await request.json();

    let listHtml = '';
    for (let user of users) {
            let userHtml = '<tr><td>'+ user.id +'</td><td>' + user.name + ' ' + user.lastname + '</td><td>'
                                + user.email + '</td><td>' + user.phone
                                + '</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
            listHtml += userHtml;
    }

    document.querySelector('#usersTable tbody').outerHTML = listHtml;
}