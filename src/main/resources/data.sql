INSERT INTO MANUFACTURER (ID, NAME)
	VALUES
		(1, 'Khalil Mamoon'),
		(2, 'Mat Pear');

INSERT INTO BOTTLE (ID, NAME, VOLUME, MANUFACTURER_ID)
    VALUES
        (1, 'Simple', 'Big', 1);

INSERT INTO TUBE (ID, NAME, MANUFACTURER_ID)
    VALUES
        (1, 'Трубка обычная', 2);

INSERT INTO HOOKAH (ID, NAME, DESCRIPTION, PRICE, BOTTLE_ID, TUBE_ID, MANUFACTURER_ID)
	VALUES
		(1, 'Beast', 'Super hookah for your sluha', 3000, 1, 1, 1);