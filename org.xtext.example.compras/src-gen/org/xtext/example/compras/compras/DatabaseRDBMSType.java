/**
 * generated by Xtext 2.17.0
 */
package org.xtext.example.compras.compras;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Database RDBMS Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.compras.compras.ComprasPackage#getDatabaseRDBMSType()
 * @model
 * @generated
 */
public enum DatabaseRDBMSType implements Enumerator
{
  /**
   * The '<em><b>SQLSERVER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQLSERVER_VALUE
   * @generated
   * @ordered
   */
  SQLSERVER(0, "SQLSERVER", "SQLSERVER"),

  /**
   * The '<em><b>ORACLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORACLE_VALUE
   * @generated
   * @ordered
   */
  ORACLE(1, "ORACLE", "ORACLE (future...)"),

  /**
   * The '<em><b>POSTGRES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSTGRES_VALUE
   * @generated
   * @ordered
   */
  POSTGRES(2, "POSTGRES", "POSTGRES (future...)");

  /**
   * The '<em><b>SQLSERVER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SQLSERVER
   * @model
   * @generated
   * @ordered
   */
  public static final int SQLSERVER_VALUE = 0;

  /**
   * The '<em><b>ORACLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ORACLE
   * @model literal="ORACLE (future...)"
   * @generated
   * @ordered
   */
  public static final int ORACLE_VALUE = 1;

  /**
   * The '<em><b>POSTGRES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSTGRES
   * @model literal="POSTGRES (future...)"
   * @generated
   * @ordered
   */
  public static final int POSTGRES_VALUE = 2;

  /**
   * An array of all the '<em><b>Database RDBMS Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DatabaseRDBMSType[] VALUES_ARRAY =
    new DatabaseRDBMSType[]
    {
      SQLSERVER,
      ORACLE,
      POSTGRES,
    };

  /**
   * A public read-only list of all the '<em><b>Database RDBMS Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DatabaseRDBMSType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Database RDBMS Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseRDBMSType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DatabaseRDBMSType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Database RDBMS Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseRDBMSType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DatabaseRDBMSType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Database RDBMS Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static DatabaseRDBMSType get(int value)
  {
    switch (value)
    {
      case SQLSERVER_VALUE: return SQLSERVER;
      case ORACLE_VALUE: return ORACLE;
      case POSTGRES_VALUE: return POSTGRES;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private DatabaseRDBMSType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //DatabaseRDBMSType