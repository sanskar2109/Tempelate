class Test<T> {
    public void show(T arr[])
    {
        for (T R : arr)
        {
            System.out.println(R);
        }
    }

    public static void main(String[] args) {
        String arr1[]={"AAA","BBB","CCC","DDD"};
        Character arr2[]={'A','B','C','D'};
        Integer arr3[]={10,20,30,40};
        Test obj=new Test();
        obj.show(arr1);
        obj.show(arr2);
        obj.show(arr3);
    }
}
