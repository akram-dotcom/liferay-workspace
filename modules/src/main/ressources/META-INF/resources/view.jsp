<form action="<portlet:actionURL name='calculateAmount'/>" method="post">
    <label for="options">Vos options:</label>
    <input type="text" id="options" name="options"><br>
    <label for="dob">Date de naissance (dd/mm/aaaa):</label>
    <input type="text" id="dob" name="dob"><br>
    <button type="submit">Calculer mon devis</button>
</form>
<c:if test="${not empty amount}">
    <p>Montant à payer: ${amount} DH TTC</p>
</c:if>
