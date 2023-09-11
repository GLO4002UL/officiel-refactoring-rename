package ca.glo4002.ulaval.rename;

import java.util.Objects;

public class ClassNameToBeRenamed {

  private String fieldToBeRenamed;

  ClassNameToBeRenamed(String fieldToBeRenamed) {
    this.fieldToBeRenamed = fieldToBeRenamed;
  }

  public String getFieldToBeRenamed() {
    return fieldToBeRenamed;
  }

  public void setFieldToBeRenamed(String fieldToBeRenamed) {
    this.fieldToBeRenamed = fieldToBeRenamed;
  }

  @Override
  public String toString() {
    return "ca.glo4002.ulaval.ClassNameToBeRenamed{" +
        "fieldToBeRenamed='" + fieldToBeRenamed + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    // Tout d'abord, on s'assure que l'objet passé en argument n'est pas null et qu'il est du type (ca.glo4002.ulaval.ClassNameToBeRenamed)
    // ensuite on compare la valeur du champ fieldToBeRenamed
    // notes:
    //  - les commentaires sont mauvais
    //  - ne prenez pas ceci comme un exemple
    //  - je peux lire le code autant que vous
    //  - si ton code est trop difficile à comprendre, ajouter des commentaires n'est pas la solution, la solution est d'écrire du meilleur code...
    ClassNameToBeRenamed classNameToBeRenamed = (ClassNameToBeRenamed) o;
    return Objects.equals(fieldToBeRenamed, classNameToBeRenamed.fieldToBeRenamed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldToBeRenamed);
  }
}
