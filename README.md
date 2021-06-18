SSON library
====

Serializer�� JSON�� ������! SSON ��!

Now, Serializer meet JSON, Call me SSON !

# 1. Goal

Spring framework���� RestAPI���񽺸� �ۼ��� ��� Model ��ü���� JSON�������� ��ȯ�ϴ� ��찡 �ٹݻ翴��.

�׷��鼭 �پ��� �䱸������ �־��µ� �� �䱸������ �����ϴ� ���̺귯���� ������� �ߴ�.

��� �̿� �����ϴ� ���̺귯������ ��������, �ϳ��� ���̺귯���� �ƴ� �������� ���̺귯���� �����ؾ� ������, 

��������� ���� ����ϱ⿡�� �����ϰų� ��ư�, �ҽ��ڵ带 �б� ��ư� �������ȴ�.

�� �䱸���׵��� �Ʒ��� ���Ҵ�.


When developed the RestAPI service using Spring Framework, often necessary to respond to objects in JSON format.
 
And there's always need some similar requirement. So I try to create an easy-to-use library to satisfy the requirements I need.

There were many libraries that requirements I wanted.

However, there was divided into several libraries, not one, and had to dependency various libraries.

And the setting method is complicated or difficult for me to use, and makes the source code difficult to read.

Those requirements are as written below.


# 1.1. Most important requirements

1. ���������� ���� properties �ϳ��� �����Ѵ�

2. �ִ��� �ٸ� JSON, Parser���� ���̺귯���� �������� �ʵ��� �Ѵ�

3. Spring�� Processor�� �����ϱ� ������ �Ѵ�


1. Setting file is satisfied with only a single property file

2. Avoid dependency other JSON, Parser, etc. libraries

3. Easy to link with processor of Spring framework


# 1.2. Bind values to fields from request parameter

- Request Parameter ���� �޾ƿö� ���� �� �ֵ��� �Ѵ�.

- Request Parameter�� �̸��� Field�� �̸��� �ٸ��� �����ǵ��� �Ѵ�.


- Fields can get values in request parameter values.

- Fields name can be set differently from Request parameter names


# 1.2. Easy-to-convert object to JSON String

- Null�� ��� dispose �� �� �ֵ��� �Ѵ�

- field�� Primitive Number Ÿ���� ��� integer, long, double, float�� sined, unsined ������� type�� ���߾� expose�Ѵ�.
  (��Ȥ return�� integer �ε� 1.0, 0.0, 10.0 �� ���� expose�Ǿ� ����Ҷ��� ���Ҵ�)

- field�̸��� expose�̸��� �ٸ��� ������ �� �־�� �Ѵ�.

- ��Ȥ �ǵ����� �ʰ� Exception�� ����� ��찡 ���� �ִ�. �׷� ��� �����ϰ� �Ѿ �� �ִ� ������ ���ԵǾ�� �Ѵ�.

- If object is null, can be dispose.

- If the field is a Primitive Number type, 
Expose according to the type regardless of whether it is sine or unsine, such as integer, long, double, float, etc.
(Sometimes, return type is Integer, but it is often problems to expose such as 1.0, 0.0,  10.0)

- Sometimes, throws unintended exceptions. Some cases can ignore exception on custom settings

# 1.3. ���ǿ� ���߾� �����ϰ� ���

- expose ���� ������� ������ ���߾� �۵��� �� �ֵ��� �Ѵ�. 
  (��: ������� ������ ���� model�� ��� Ư�� field�� dispose, �����ڸ� expose �ǵ��ϰ����ڸ� ���, �Ǵ� �����ڸ� ���ų� ������ ������ �ʰ� etc..)


# 1.4. ���� Rule ����

- �ҽ��ڵ带 �� �̻� ���������ʵ���, �ܼ��ϰ� Model�� Annotation �߰��� �̷�������� �Ѵ�

- @FIXME ���� ���� ;;

# 2. �������

# 2.1 Annotation 

# 2.2 SSON !



# 3. ��뼳��

# 4. ��Ű���� ����

# 5. ��Ÿ