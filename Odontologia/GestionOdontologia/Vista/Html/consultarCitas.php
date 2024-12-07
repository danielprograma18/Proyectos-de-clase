public function consultarCitaPorId($id){
$conexion = new Conexion();
$conexion->abrir();
$sql = "SELECT pacientes.* , pedicos.*, consultorios.*, citas.*"
. "FROM Pacientes as pacientes, Medicos as medicos, Consultorios
as consultorios ,citas "
. "WHERE citas.CitPaciente = pacientes.PacIdentificacion "
. " AND citas.CitMedico = medicos.MedIdentificacion "
. " AND citas.CitNumero = $id";
$conexion->consulta($sql);
$result = $conexion->obtenerResult();
$conexion->cerrar();
return $result ;
}

<div id="contenido">
<h2>Consultar Cita</h2>
<form action="index.php?accion=consultarCita" method="post" id="frmconsultar">
<table>
<tr>
<td>Documento del Paciente</td>
<td><input type="text" name="consultarDocumento"
id="consultarDocumento"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="consultarConsultar"
value="Consultar" id="consultarConsultar"></td>
</tr>
<tr>
<td colspan="2"><div id="paciente2"></div></td>
</tr>
</table>
</form>
</div>

<div id="contenido">
<h2>Cancelar Cita</h2>
<form action="index.php?accion=cancelarCita" method="post"
id="frmcancelar">
<table>
<tr>
<td>Documento del Paciente </td>

<td><input type="text" name="cancelarDocumento"

id="cancelarDocumento"></td>
</tr>
<tr>
<td colspan="2"><input type="submit"
name="cancelarConsultar" value="Consultar" id="cancelarConsultar"></td>
</tr>
<tr>
<td colspan="2"><div id="paciente3"></div></td>
</tr>
</table>
</form>
</div>

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
$controlador->agregarCita(

    $_POST["asignarDocumento"],

$_POST["medico"],
$_POST["fecha"],
$_POST["hora"],
$_POST["consultorio"]);

}
elseif($_GET["accion"] == "consultarCita"){
$controlador->consultarCitas($_POST["consultarDocumento"]);
}
} else {
$controlador->verPagina('Vista/html/inicio.php');
}

