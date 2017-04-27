
<!DOCTYPE html>
<html lang="en">


<body>

<div class="container">

    <h1>All Targets</h1>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>#ID</th>
            <th>Target</th>
            <th>Target Amount</th>
            <th>Target Date</th>
        </tr>
        </thead>

        <c:forEach var="target" items="${targets}">
            <tr>
                <td>${target.id}</td>
                <td>${target.target}</td>
                <td>${target.targetAmount}</td>
                <td>${target.targetDate}</td>
                <td>
                    <spring:url value="/targets/${target.id}"        var="targetUrl" />
                    <spring:url value="/targets/${target.id}/delete" var="deleteUrl" />
                    <spring:url value="/targets/${target.id}/update" var="updateUrl" />

                    <button class="btn btn-info"
                            onclick="location.href='${targetUrl}'">Info</button>
                    <button class="btn btn-update"
                            onclick="location.href='${updateUrl}'">Update</button>
                    <button class="btn btn-delete"
                            onclick="this.disabled=true;post('${deleteUrl}')">Delete</button>

                </td>
            </tr>
        </c:forEach>
    </table>

</div>


</body>
