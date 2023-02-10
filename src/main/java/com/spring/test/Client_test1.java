package com.spring.test;

import java.sql.Connection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDTO;
import com.spring.board.BoardService;
import com.spring.common.JDBCUtil;

public class Client_test1 {
	
	public static void main(String[]args) {
		
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Connection conn = null;
		
		//��ü ���� �� �޼ҵ� ȣ��
		JDBCUtil db = new JDBCUtil();
		conn = db.getConnection();	
		
		//��ü ���� ���� Ŭ���� �̸����� ���
		conn = JDBCUtil.getConnection();
		
		System.out.println("===============================");
		
		// ������ �����̳ʷκ��� Bean�� ȣ��  : BoardService : �������̽�
		BoardService boardService = (BoardService) factory.getBean("boardService");
		
		//DTO ��ü�� ���� �Ŀ� Setter �������� DTO �� �ʵ��� ���� �Է�
		BoardDTO boardDTO = new BoardDTO();
		
		//DTO�� setter �� ����ؼ� �� �ʵ��� ���� �Ҵ�. : title, write, content
		boardDTO.setTitle("�ӽ�����-10");
		boardDTO.setWriter("ȫ�浿");
		boardDTO.setContent("�ӽó����Դϴ�.");
		
		//insert ��� �׽�Ʈ �Ϸ�
		boardService.insertBoard(boardDTO);
		
		//Update ��� �׽�Ʈ 
		boardDTO.setTitle("������ ����");
		boardDTO.setContent("������ ����");
		boardDTO.setSeq(6);    //���� : DB���� �ݵ�� �����ؾ���. (SEQ)
		
		//UpdateBoard ��� �׽�Ʈ �Ϸ�
		boardService.updateBoard(boardDTO);
		
		
		
		
		
		
		
		
		
	}

}
