<html>
  <head>
    <meta name="layout" content="main" />
    <title>Hello world</title>
  </head>
  <body>
    <div>
      <b>Hello</b> GSP ${name} at ${new Date()}
    </div>

    <g:render template="foo" model="['foo':name]" />
  </body>
</html>
