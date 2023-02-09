<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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

      <h3>작성된 글</h3>
      <form action="" class="col-12" method="post">
      <input type="hidden" name="id" id ="id" value="${n.id}">
        <div class="form-group mt-3">
          <label for="title" class="col-form-label">제목 :</label>
          <input type="text" name="title" id="title" class="form-control" placeholder="제목을 표시하기." value="${n.title }">
        </div>
        <div class="form-group mt-3 col-12 d-inline-flex">
          <div class="form-group mt-3 col-6">
            <label for="writer" class="col-form-label">작성자 :</label>
            <input type="text" name="writer" id="writer" class="form-control" placeholder="작성자를 표시하기." value="${n.writer }">
          </div>
          <div class="form-group mt-3 col-3">
            <label for="" class="col-form-label">조회수 :</label>
            <input type="text" name="views" id="views" class="form-control" style="pointer-events: none;" placeholder="조회수를 표시하기."
              value="${n.views }">
          </div>
          <div class="form-group mt-3 col-3">
            <label for="" class="col-form-label">작성일 :</label>
            <input type="text" name="regDate" id="regDate" class="form-control" style="pointer-events: none;" placeholder="작성일을 표시하기."
              value="${n.regDate }">
          </div>
        </div>
        <div class="form-group mt-3">
          <label for="content" class="col-form-label ">내용 :</label>
          <textarea name="content" id="content" cols="30" rows="10" class="form-control"
            placeholder="내용을 표시하기.">${n.content }</textarea>
        </div>

        <div class="form-group mt-3">
          <a href="list" style="text-decoration: none; color: white;" class="btn btn-dark"> List </a>
          <input type="submit" value="Update" class="btn btn-primary" formaction="update2">
          <input type="submit" value="Delete" class="btn btn-danger" formaction="delete">
        </div>

      </form>

    </div>


  </body>

  </html>