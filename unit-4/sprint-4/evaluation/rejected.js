var tbody=document.querySelector("tbody")

function rejected() {
    var data=JSON.parse(localStorage.getItem("admission-rejected"))
    var tr=document.createElement("td")
    var td1=document.createElement("td")
    var td2=document.createElement("td")
    var td3=document.createElement("td")
    var td4=document.createElement("td")
    var td5=document.createElement("td")
    data.map((e) => {
        td1.textContent=e.name
        td2.textContent=e.email
        td3.textContent=e.phone
        td4.textContent=e.gender
        td5.textContent=e.course

        tr.append(td1,td2,td3,td4,td5)
        tbody.append(tr)
        console.log(e)
    })
}

rejected()