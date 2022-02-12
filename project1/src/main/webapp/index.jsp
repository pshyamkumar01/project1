<!DOCTYPE html>
<html lang="en">
<head>
  <title>Learner's Academy</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<br><br><br>
<div class="container mt-3">
 <h3 align = "center">LEARNER'S ACADEMY</h3>
 <br><br>
  <h5>Administrator Login</h5>
  
  
  <form action="loginServlet">
    <div class="input-group mb-3">
      
      <input type="text" class="form-control" placeholder="Username" id="usr" name="username">
    </div>

    <div class="input-group mb-3">
      <input type="password" class="form-control" placeholder="Password" id="mail" name="password">
     
    </div>
    <button type="submit" class="btn btn-primary">Login</button>
  </form>
</div>

</body>
</html>