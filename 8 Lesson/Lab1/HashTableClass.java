public class HashTableClass {
    private Item[] table;
    //количество элементов в таблице
    private int count = 0;
    //размер таблицы
    private int size;

    public HashTableClass(int size)
    {
        this.size = size;
        table = new Item[size];
    }
    public HashTableClass()
    {
        this.size = 10;
        table = new Item[size];
    }

    private <E extends Object> int hashItem(E key)
    {
        int hash = 0;

        for(int i = 0; i < key.toString().length(); i++)
            hash = (31 * hash + key.toString().charAt(i)) % size;

        return hash;
    }


    public <E> void addItem(E key)
    {
        Item item = new Item(key);
        int hash = hashItem(key);
        while(table[hash] != null)
        {
            hash++;
            hash %= size;
        }
        table[hash] = item;
        count++;
        resize();
    }

    public void print()
    {
        for(int i = 0; i < size; i++)
            if(table[i] != null)
                System.out.println(i + ") " + table[i].getKey().toString());
    }

    public <E> void findItem(E key)
    {
        int hash = hashItem(key);
        boolean temp = false;
        while(table[hash] != null)
        {
            if(table[hash].getKey().equals(key))
            {
                System.out.println(hash + "\t" + table[hash].getKey().toString());
                temp = true;
            }

            hash++;
            hash = hash % size;
        }
        if (!temp)
            System.out.println("Нет такого ключа!");

    }
    private boolean resize()
    {
        if ((((this.count*100)/this.size) >= 75))
        {
            Item[] tempTable = new Item[this.size + 10];
            for (int i =0; i < this.table.length;i++)
            {
                tempTable[i] = this.table[i];
            }
            this.table = tempTable;
            this.size += 10;
            return true;
        } else return false;
    }
}
