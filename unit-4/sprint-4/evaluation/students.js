var tbody=document.querySelector("tbody")

function student() {
    var admission=JSON.parse(localStorage.getItem("admission"))
    var tr =document.createElement("td")
    var td1 =document.createElement("td")
    var td2=document.createElement("td")
    var td3=document.createElement("td")
    var td4=document.createElement("td")
    var td5=document.createElement("td")
    var button1=document.createElement("button")
    var button2=document.createElement("button")
    admission.map((e) => {
        td1.textContent=e.name
        td2.textContent=e.email
        td3.textContent=e.phone
        td4.textContent=e.gender
        td5.textContent=e.course
        button1.textContent="Admitted"
        button2.textContent="Rejected"

        tr.append(td1,td2,td3,td4,td5,button1,button2)
        tbody.append(tr)
        let array=[]
        button1.addEventListener("click",addmitted)

        function addmitted(){
            var obj={
                name:td1.textContent,
                email:td2.textContent,
                phone:td3.textContent,
                gender:td4.textContent,
                course:td5.textContent,

            }
            array.push(obj)
localStorage.setItem("admission-addmitted",JSON.stringify(array))
            console.log(array)
            }
            let array2=[]
                      button1.addEventListener("click",rejected)
            function rejected(){
                       var obj={
                       name:td1.textContent,
                       email:td2.textContent,
                       phone:td3.textContent,
                gender:td4.textContent,
                course:td5.textContent,
            }
            array2.push(obj)
localStorage.setItem("admissn-rejected",JSON.stringify(array2))
            console.log(array)            
        }
    })

}