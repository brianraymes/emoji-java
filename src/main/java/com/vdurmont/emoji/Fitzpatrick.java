package com.vdurmont.emoji;

/**
 * Enum that represents the Fitzpatrick modifiers supported by the emojis.
 */
public enum Fitzpatrick {
  /**
   * Fitzpatrick modifier of type 1 (pale white)
   */
  TYPE_1("\uD83C\uDFFB", "127995", "x1f3fb"),

  /**
   * Fitzpatrick modifier of type 2 (cream white)
   */
  TYPE_2("\uD83C\uDFFC", "127996", "x1f3fc"),

  /**
   * Fitzpatrick modifier of type 3 (moderate brown)
   */
  TYPE_3("\uD83C\uDFFD", "127997", "x1f3fd"),

  /**
   * Fitzpatrick modifier of type 4 (dark brown)
   */
  TYPE_4("\uD83C\uDFFE", "127998", "x1f3fe"),

  /**
   * Fitzpatrick modifier of type 5 (black)
   */
  TYPE_5("\uD83C\uDFFF", "127999", "x1f3ff");

  /**
   * The unicode representation of the Fitzpatrick modifier
   */
  public final String unicode;

  /**
  * The decimal representation of the Fitzpatrick modifier
  */
  public final String decimal;

  /**
  * The hex representation of the Fitzpatrick modifier
  */
  public final String hex;

  Fitzpatrick(String unicode, String decimal, String hex) {
    this.unicode = unicode;
    this.decimal = decimal;
    this.hex = hex;
  }

  public static Fitzpatrick fitzpatrickFromUnicode(String unicode) {
    for (Fitzpatrick v : values()) {
      if (v.unicode.equals(unicode)) {
        return v;
      }
    }
    return null;
  }

  public static Fitzpatrick fitzpatrickFromType(String type) {
    try {
      return Fitzpatrick.valueOf(type.toUpperCase());
    }
    catch (IllegalArgumentException e) {
      return null;
    }
  }
}
