package com.ict05.collection;

public class Ex01 {
	// ���׸��� �÷��� (�ڷᱸ��)
	// ���׸� : �÷����� � ��ü��� �̷���������� ǥ���ϴ� ��üŸ���� ���Ѵ�.
	// �÷��� : ��ü���� ��Ƽ� �����ϴ� �������̽��� ������ ��

	// API : <T(type)> => ��üŸ��, <E(elements)> => ���(�÷��� �ȿ� �����ϴ� ��ü �ϳ��� ���Ѵ�.)
	// Map ���Ŀ����� <K, V> => Key(Ű), Value(���)
	// Key�� Value�� 1:1 ����, Key�� ȣ���ϸ� Value�� ���´�.

	// ���� : �÷���<���׸�>
	// �ֻ��� �÷����� Collection<E>, Map<K,V>
	// Collection<E>�� ��ӹ��� �������̽� : Set<E>, List<E>, Queue<E>

	// Collection�� �ֿ� �޼ҵ�
	// add(E e) : boolean => �ش� �÷��ǿ� ��ü �߰�, �����ϸ� true, �����ϸ� false

	// addAll(Collection<? extends E> c) : boolean
	// => Ư���÷��ǿ� �ִ� ��� ��ҵ��� �ٸ� �÷��ǿ� �߰�

	// clear() : void => ��� ��� ����
	// contains(Object o) : boolean => �ش� �÷��ǿ� ���ڷ� ���� ��ü�� �����ϸ� true, �ƴϸ� false

	// containsAll(Collection<?> c) : boolean
	// => �� �÷��ǿ� ������ �÷����� ��� ��Ұ� ���� �� ��� true

	// equals(Object o) : boolean => ������ ��ü���� �÷����� ������ ��
	// isEmpty() : boolean => �ش� �÷����� ��������� true
	// iterator() : iterator<E>
	// => �÷��� �ȿ� �����ϴ� ��ҵ��� ������� �����ϱ� ���� Iterator ��ü�� ��ȯ
	// => �÷��� �ȿ� �����ϴ� ��ҵ��� �ϳ��� ������ �۾��� �� ����Ѵ�.

	// remove(Object o) : boolean => ���ڷ� ���� ��ü�� ������ �� ���, �����ϸ� true

	// size () : int => �÷��� �ȿ� �����ϴ� ��ҵ��� �� ( for���� ��밡�� )
	
	// toArray() : Obejct[] => �÷����� �迭�� �����.
}
