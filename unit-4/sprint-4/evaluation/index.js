var form = document.getElementById("form").addEventListener("submit",handlesubmit)
function handlesubmit(e) {
    e.preventDefault()
    console.log("yes")
    var name=document.getElementById("name").value
    var email=document.getElementById("email").value
    var phone=document.getElementById("phone").value
    var gender=document.getElementById("gender").value
    var course=document.getElementById("course").value
  var array=[]
    var obj={
        name:name,
        email:email,
        phone:phone,
        gender:gender,
        course:course
    }
    array.push(obj)
  localStorage.setItem("admission",JSON.stringify(array))

    console.log(array)
}



