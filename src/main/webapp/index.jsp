<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Demo rest</title>
</head>
<body>
    
    <h3>Spring Rest Demo</h3>

    <a href="${pageContext.request.contextPath}/test/hello">Hola bienvenidos</a>
    <br><br>
    <a href="${pageContext.request.contextPath}/api/students">Obtener lista estudiantes</a>
</body>
</html>