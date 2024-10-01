USE GELATO; 

CREATE TABLE  IF NOT EXISTS GELATOTYPES
(
	GLT_CODE 		INT  COMMENT '상품 코드',
	GLT_NAME 		VARCHAR(9) NOT NULL COMMENT '상품명',
	GLT_PRICE 		INT COMMENT '상품가격',
    PRODUCT_NUMBER 	INT COMMENT '상품갯수',
	CONSTRAINT GLT_CODE	PRIMARY KEY (GLT_CODE)
) ENGINE=INNODB 		COMMENT = '상품';

	INSERT INTO GELATOTYPES (GLT_CODE,GLT_NAME,GLT_PRODUCT_NUMVER) VALUES
		('G1','치즈케익젤라또','3200원','20개'),
		('G2','딥초코젤라또','3000원','20개'),
		('G3','초당젤라또','3500원','20개'),
		('G4','쿠키앤크림젤라또','3300원','20개'),
		('G5','허니요거트젤라또','3100원','20개'),
		('G6','말차젤라또','3200원','20개'),
		('G7','연유젤라또','3200원','20개'),
		('G8','딸기젤라또','3200원','20개'),
		('G9','흑임자젤라또','3200원','20개'),
		('G10','달고나젤라또','3300원','20개'),
		('G11','고구마젤라또','3200원','20개'),
		('G12','순우유젤라또','3200원','20개'),
		('G13','저칼로리젤라또','2900원','20개');
		
	
     