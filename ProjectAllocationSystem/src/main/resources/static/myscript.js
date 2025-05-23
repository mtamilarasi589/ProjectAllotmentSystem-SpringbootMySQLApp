function showProjects(){
    fetch("/projects") //API End point
    .then((response) => response.json())
    .then((projects) => {
        const dataTable = document.getElementById("projecttable")

        projects.forEach(project => {
            var row = `<tr>
            <td>${project.projectId}</td>
            <td>${project.projectName}</td>
            <td>${project.manager}</td>
            <td>${project.durationInMonths}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}

function showAssignedMembers(){
    fetch("/projects/assigned") //API End point
    .then((response) => response.json()) //Http response into json object
    .then((members) => {
        const dataTable = document.getElementById("assignedtable")

        members.forEach(member => {
            var row = `<tr>
            <td>${member.name}</td>
            <td>${member.emailId}</td>
            <td>${member.projectName}</td>
            </tr>`

            dataTable.innerHTML+=row;
        });
    });
}