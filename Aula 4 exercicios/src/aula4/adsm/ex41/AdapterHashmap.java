package aula4.adsm.ex41;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class AdapterHashmap<K> extends HashMap<K, K>
implements Map<K, K>, Cloneable, Serializable
{
private static final long serialVersionUID = 1L;

public AdapterHashmap()
{
  super();
}

public AdapterHashmap(int initialCapacity) throws IllegalArgumentException
{
  super(initialCapacity);
}

public AdapterHashmap(int initialCapacity, float loadFactor)
  throws IllegalArgumentException
{
  super(initialCapacity, loadFactor);
}

public AdapterHashmap(K[][] matrix)
  throws IllegalArgumentException, NullPointerException
{
  super();

  if(matrix == null)
  {
    throw new NullPointerException("Matriz nula");
  }

  if(matrix.length != 2)
  {
    throw new IllegalArgumentException("Matriz n�o tem duas linhas");
  }

  if(matrix[0].length != matrix[1].length)
  {
    throw new IllegalArgumentException("Linhas de comprimento diferente");
  }

  for(int column = 0; column < matrix[0].length; column++)
  {
    put(matrix[0][column], matrix[1][column]);
  }
}

public AdapterHashmap(Map<? extends K, ? extends K> map)
  throws NullPointerException
{
  super(map);
} 

}
