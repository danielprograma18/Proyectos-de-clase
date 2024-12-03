<?php
// 1. Primero los require_once de todas las clases necesarias
require_once 'Controlador/Controlador.php';
require_once 'Modelo/GestorCita.php';
require_once 'Modelo/Cita.php';
require_once 'Modelo/Paciente.php';
require_once 'Modelo/Conexion.php';

// 2. Crear una instancia del controlador
$controlador = new Controlador();

// 3. Código selector para las diferentes páginas
if( isset($_GET["accion"])){
    if($_GET["accion"] == "asignar"){
    $controlador->verPagina('Vista/html/asignar.php');
    }
    elseif($_GET["accion"] == "consultar"){
    $controlador->verPagina('Vista/html/consultar.php');
    }
    elseif($_GET["accion"] == "cancelar"){
    $controlador->verPagina('Vista/html/cancelar.php');
    }
    elseif($_GET["accion"] == "guardarCita"){
    $controlador->agregarCita($_POST["asignarDocumento"],

    $_POST["medico"],
    $_POST["fecha"],
    $_POST["hora"],
    $_POST["consultorio"]);
    
    }
    elseif($_GET["accion"] == "cancelarCita"){
        $controlador->cancelarCitas($_POST["cancelarDocumento"]);
        }
    } else {
    $controlador->verPagina('Vista/html/inicio.php');
    } 
 
?>