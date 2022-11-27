<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

</head>

<body>
  <header class="p-3 bg-dark text-white">
    <div class="container">
      <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">

        <ul class="nav col-8 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
          <li><a href="#" class="nav-link px-2 text-secondary">Home</a></li>
          <li><a href="#" class="nav-link px-2 text-white">Features</a></li>
          <li><a href="#" class="nav-link px-2 text-white">Pricing</a></li>
          <li><a href="#" class="nav-link px-2 text-white">FAQs</a></li>
          <li><a href="#" class="nav-link px-2 text-white">About</a></li>
        </ul>


        <div class="text-end">
          <button type="button" class="btn btn-outline-light me-2">Login</button>
          <button type="button" class="btn btn-warning">Sign-up</button>
        </div>
      </div>
    </div>
  </header>

  <br>
  <h1 class="text-center">Notice Board</h1>
  <br>
  <br>

  <div class="container">

    <h3>글쓰기</h3>
    <form action="/NoticeBoard_JSP/insert" method="post" class="col-12">
      <div class="form-group mt-3">
        <label for="title" class="col-form-label">제목 :</label>
        <input type="text" id="title" name="title" class="form-control" placeholder="제목을 입력하세요.">
      </div>
      <div class="form-group mt-3">
        <label for="writer" class="col-form-label">작성자 :</label>
        <input type="text" id="writer" name="writer" class="form-control" placeholder="작성자를 입력하세요.">
      </div>
      <div class="form-group mt-3">
        <label for="content" class="col-form-label ">내용 :</label>
        <textarea name="content" id="content" cols="30" rows="10" class="form-control" placeholder="내용을 입력하세요."></textarea>
      </div>
      <div class="form-group mt-3">
        <button class="btn btn-dark">Submit</button>
        <button class="btn btn-danger" href="/NoticeBoard_JSP/list">취소</button>
      </div>

    </form>

  </div>


</body>

</html>