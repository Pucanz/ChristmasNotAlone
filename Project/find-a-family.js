const API_URL = "http://localhost:8080/ChristmasNotAlone/";
window.onload = async function () {
  
 await getCustomers();
  //editCustomer();
}
  async function getCustomers() {
    try{
        const response = await fetch(API_URL);
        const family = await response.json();
        return populateTable(family);
    } catch(error){
        console.error("Error fetching family", error);
    }
  }

  function populateTable(family) {
    const table = document.querySelector("#tableBody");
    table.innerHTML = "";
    family.forEach((fam) => {
      const row = `
        <tr>
          <td hidden>${fam.id}</td>
          <td>${fam.familyName}</td>
          <td>${fam.phone}</td>
          <td>${fam.email}</td>
          <td>${fam.zipCode}</td>
          <td>${fam.pets}</td>
          <td>${fam.meal}</td>
          <td>${fam.available}</td>
          <td>${fam.description}</td>
          <td>
        </tr>
          `;
         table.innerHTML += row;
    });
  }

  document.getElementById('filterInput').addEventListener('input', function() {
    let filter = this.value.toLowerCase();
    let table = document.getElementById('familyTable');
    let rows = table.getElementsByTagName('tr');  

    for (let i = 1; i < rows.length; i++) {  
        let cells = rows[i].getElementsByTagName('td');
        let rowText = '';
        
        
        for (let j = 0; j < cells.length; j++) {
            rowText += cells[j].textContent.toLowerCase();
        }

        if (rowText.includes(filter)) {
            rows[i].style.display = '';  
        } else {
            rows[i].style.display = 'none'; 
        }
    }
});

