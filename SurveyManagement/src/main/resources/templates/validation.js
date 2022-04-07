function validate() {
  let x1 = document.getElementById("surveyname");
  if (x1.value == "") {
    document.getElementById("p1").innerHTML =
      "*Survey name should not be empty*";
    return false;
  }

  let x2 = document.getElementById("surveytype");
  if (x2.value == "") {
    document.getElementById("p2").innerHTML =
      "*Survey type should not be empty*";
    return false;
  }

  let x3 = document.getElementById("surveyname");
  if (x3.value == "") {
    document.getElementById("p3").innerHTML = "*This is mandatory*";
    return false;
  }

  let x4 = document.getElementById("surveyname");
  if (x4.value == "") {
    document.getElementById("p4").innerHTML = "*This is mandatory *";
    return false;
  }

  let x5 = document.getElementById("surveyname");
  if (x5.value == "") {
    document.getElementById("p5").innerHTML =
      "*Please give your feedback in Description  *";
    return false;
  }
}
