SSON library
====

Now, Serializer meet JSON, Call me SSON !

Serializer�� JSON�� ������! SSON ��!

spring boot�� �н��ϸ� �� �� �ۼ��� ���̺귯��

# 1. ��ǥ

When developed the RestAPI service using Spring Framework, often necessary to respond to objects in JSON format.
 
And there's always need some similar requirement. So I try to create an easy-to-use library to satisfy the requirements I need.

There were many libraries that requirements I wanted.

However, there was divided into several libraries, not one, and had to dependency various libraries.

And the setting method is complicated or difficult for me to use, and makes the source code difficult to read.

Those requirements are as written below.

Spring framework���� RestAPI���񽺸� ������ ��� Model ��ü���� JSON�������� ��ȯ�ϴ� ��찡 �ٹݻ翴��.

�׷��鼭 �پ��� �䱸������ �־��µ� �� �䱸������ �����ϴ� ���̺귯���� ������� �ߴ�.

��� �̿� �����ϴ� ���̺귯������ ��������, �ϳ��� ���̺귯���� �ƴ� �������� ���̺귯���� �����ؾ� ������, 

��������� ���� ����ϱ⿡�� �����ϰų� ��ư�, �ҽ��ڵ带 �б� ��ư� �������ȴ�.

�� �䱸���׵��� �Ʒ��� ���Ҵ�.

# 1.1. �߿��� �䱸

- ���������� ���� properties �ϳ��� �����Ѵ�

- �ִ��� �ٸ� JSON, Parser���� ���̺귯���� �������� �ʵ��� �Ѵ�

- Spring�� Processor�� �����ϱ� ������ �Ѵ�


# 1.2. Controller���� Model�� �Ķ���� �� ���ε� �ޱ�

- Request Parameter ���� �޾ƿö� ���� �� �ֵ��� �Ѵ�.

- Request Parameter�� �̸��� Field�� �̸��� �ٸ��� �����ǵ��� �Ѵ�.

# 1.2. ��ü�� Json String���� ��ȯ

- Null�� ��� dispose �� �� �ֵ��� �Ѵ�

- field�� Primitive Number Ÿ���� ��� integer, long, double, float�� sined, unsined ������� type�� ���߾� expose�Ѵ�.
  (��Ȥ return�� integer �ε� 1.0, 0.0, 10.0 �� ���� expose�Ǿ� ����Ҷ��� ���Ҵ�)

- field�̸��� expose�̸��� �ٸ��� ������ �� �־�� �Ѵ�.

# 1.3. ���ǿ� ���߾� �����ϰ� ���

- expose ���� ������� ������ ���߾� �۵��� �� �ֵ��� �Ѵ�. 
  (��: ������� ������ ���� model�� ��� Ư�� field�� dispose, �����ڸ� expose �ǵ��ϰ����ڸ� ���, �Ǵ� �����ڸ� ���ų� ������ ������ �ʰ� etc..)


# 1.4. ���� Rule ����

- �ҽ��ڵ带 �� �̻� ���������ʵ���, �ܼ��ϰ� Model�� Annotation �߰��� �̷�������� �Ѵ�



# 2. �������

# 2.1 Annotation 

# 2.2 SSON !



# 3. ��뼳��

# 4. ��Ű���� ����

# 5. ��Ÿ