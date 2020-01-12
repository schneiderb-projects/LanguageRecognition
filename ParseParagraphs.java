import java.util.ArrayList;
import java.util.Arrays;
//import java.util.List;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class ParseParagraphs extends Parse<String>{
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	static String germanData = "Fast könnte man den Eindruck bekommen, dass in den vergangenen Wochen ein Überbietungswettbewerb von Politikern in"
			+ " Sachen Klimaschutz ausgebrochen ist. Beinahe täglich gibt es neue Vorschläge, wie man den Klimaschutz in Deutschland "
			+ "voranbringen kann, Richtung Zukunft: Das Land lockert nach und nach die extremen Regeln, an die sich Frauen in dem erzkonservativen Land "
			+ "halten müssen. Sie sollen künftig ohne die Erlaubnis eines Mannes Reisepässe erhalten und ins Ausland reisen dürfen, wie die staatliche Zeitung "
			+ "\"Umm Al-Kura\" berichtete. Das soll für Frauen über 21 Jahren gelten. Bislang benötigen sie für Reisen, ein Studium oder die Ausübung bestimmter"
			+ " Berufe die Zustimmung ihres Mannes, Vaters, Bruders oder eines anderen männlichen Verwandten. Dieses Vormundschaftssystem sorgt dafür, dass Frauen "
			+ "ihr ganzes Leben lang den rechtlichen Status einer Minderjährigen haben. Die extreme Hitze hat auch bei den Luftrettern des ADAC für Hochbetrieb "
			+ "gesorgt. Im Juli flog die ADAC Luftrettung bundesweit 5555 Einsätze, wie ein Sprecher in München mitteilte. Damit rückten die Rettungshubschrauber "
			+ "täglich rund 180 Mal Einsätzen aus. Das war durchschnittlich rund 20 Prozent häufiger als an anderen Tagen im Jahr mit rund 150 Einsätzen am"
			+ " Tag. Bei jedem zweiten Einsatz sei es um einen internistischen Notfall gegangen, etwa akute Herz-Kreislaufprobleme. Die meisten Rettungseinsätze"
			+ " in diesem Jahr flogen die Helfer am 24. Juli. An diesem Tag mussten die Crews aus Pilot, Notarzt und Notfallsanitäter bundesweit 203 Mal "
			+ "ausrücken. Vom 24. bis lengthOf1. Juli war es laut Deutschem Wetterdienst extrem heiß, teils wurden über 40 Grad gemessen. Die Zahl der "
			+ "Luftrettungseinsätze lag in diesem Juli noch über der vom Vorjahr. Auch im extrem heißen Juli 2018 war die ADAC Luftrettung bereits "
			+ "überdurchschnittliche 5507 Mal ausgerückt.Die ADAC-Station mit den meisten Einsätzen an einem Tag war im Juli Berlin: Der Hubschrauber "
			+ "\"Christoph 31\" brachte es am 4. Juli auf 13 Einsätze an einem Tag; er war von morgens 7 Uhr bis zum Sonnenuntergang pausenlos im Einsatz."
			+ " 70 Prozent der Notfälle waren akute Herz-Kreislauferkrankungen. Insgesamt startete die ADAC-Luftrettung im vergangenen Jahr zu mehr als "
			+ "54.300 Einsätzen. Sie verfügt über Rettungshubschrauber an 36 Stationen. Die USA versuchen bereits seit Wochen, breite Unterstützung "
			+ "für ihre Militärmission zum Schutz von Handelsschiffen vor iranischen Angriffen im Persischen Golf zu bekommen. Außenminister Heiko Maas "
			+ "hatte eine deutsche Beteiligung abgelehnt, weil die Bundesregierung die US-Strategie des \"maximalen Drucks\" auf den Iran für falsch halte."
			+ " Die neue Verteidigungsministerin und CDU-Chefin Annegret Kramp-Karrenbauer hatte dagegen gesagt, die Anfrage werde noch geprüft. "
			+ "Deutschland will sich nun mit Frankreich über das weitere Vorgehen abstimmen. Theoretisch wäre eine europäische Mission parallel zu der"
			+ " US-geführten möglich. Der Koordinator der Bundesregierung für die transatlantische Zusammenarbeit, Peter Beyer, fordert eine Führungsrolle "
			+ "Deutschlands bei einer möglichen europäischen Mission zur Absicherung des Schiffsverkehrs in der Straße von Hormus. \"Deutschland sollte"
			+ " hier die politische Führung übernehmen und sich nicht wegducken\", sagte der CDU-Politiker dem Redaktionsnetzwerk Deutschland (RND). \"Da "
			+ "sind die Signale tatsächlich noch nicht einheitlich und eindeutig genug.\" Ein europäischer Einsatz im Persischen Golf sei ein wichtiger "
			+ "Schritt. \"Europa kann nicht nichts machen.\" von der Mehrwertsteuersenkung für Bahnfahrten bis zur Reglementierung von Flugreisen. Dahinter "
			+ "steckt "
			+ "der grundsätzliche Richtungsstreit: Kommt man mit Anreizen oder Verboten in Sachen Klimaschutz besser voran?\n" + 
			"Die Bürger haben eine klare Tendenz: gegen Verbote. Auf die Frage, was besser ist, um die Bevölkerung zu einem klimabewussteren"
			+ " Verhalten zu bewegen, sprechen sich gerade mal 15 Prozent der Befragten im ARD-DeutschlandTrend dafür aus, klimaschädliches "
			+ "Verhalten über Verbote einzuschränken. 72 Prozent befürworten, klimafreundliches Verhalten über Anreize zu fördern. Schaut man "
			+ "sich die Anhänger der einzelnen Parteien an, überwiegt bei allen mehrheitlich der Wunsch nach Anreizen. So sind es zum Beispiel"
			+ " bei den SPD-Anhängern 80 Prozent, bei den Unionsanhängern 77 Prozent. Die Zustimmung zu Verboten ist bei den Anhängern der "
			+ "Grünen am höchsten: Hier ziehen 23 Prozent der Anhänger Verbote vor. Bei den Anhängern aller anderen Parteien liegen die Werte"
			+ " zwischen 11 und 15 Prozent. 2 Prozent der Befragten gaben in der Befragung spontan an, dass sie die Diskussion für übertrieben "
			+ "halten.Wie werden konkrete Maßnahmen zum Klima- und Umweltschutz in der Bevölkerung gesehen? Die Befragten konnten sagen, ob sie"
			+ " die Maßnahmen für sinnvoll oder nicht sinnvoll halten. Sehr breite Zustimmung gab es bei der Förderung von Innovation und "
			+ "Forschung: 97 Prozent der Befragten halten dies für eine sinnvolle Maßnahme." + 
			"Den Ausbau erneuerbarer Energien halten 92 Prozent für sinnvoll, niedrigere Preise für Bahnfahren ebenfalls 92 Prozent. Höhere "
			+ "Preise für Flugreisen halten 71 Prozent der Befragten für sinnvoll. Den Umstieg von Verbrennungsmotor auf alternative Antriebe "
			+ "bei Autos begrüßen 60 Prozent. Weniger Zustimmung erhält die Ausweitung des Emissionshandels für Unternehmen. Dieser wird von "
			+ "41 Prozent der Befragten für sinnvoll gehalten. Die Einführung einer CO2-Steuer befürworten 35 Prozent der Befragten. Die "
			+ "Unterschiede zwischen der Bevölkerung auf dem Land (in Gemeinden mit weniger als 20.000 Einwohnern) und der Stadt (mit mindestens "
			+ "100.000 Einwohnern) fallen insgesamt nicht so groß aus. Bei der CO2-Steuer gibt es allerdings größere Unterschiede: Auf "
			+ " Land halten 23 Prozent eine CO2-Steuer für sinnvoll. Eine Mehrheit von 69 Prozent hält eine CO2-Steuer für nicht sinnvoll. "
			+ "In der Stadt halten 47 Prozent eine CO2-Steuer für sinnvoll, 49 Prozent nicht. Ebenfalls unterschiedlich ist die Sicht auf den "
			+ "Umstieg von Verbrennungsmotoren auf alternative Antriebe. Auf dem Land halten 55 Prozent die Maßnahme für sinnvoll, 41 Prozent "
			+ "halten sie hingegen für nicht sinnvoll. In der Stadt befürworten 69 Prozent den Umstieg, 23 Prozent tun dies nicht. Politische "
			+ "Maßnahmen sind das Eine. Aber wie viel ist jeder einzelne jeden Monat bereit, fürs Klima auszugeben? 21 Prozent der Befragten "
			+ "sagen, sie wollen kein Geld für den Umwelt- und Klimaschutz ausgeben. 21 Prozent wären bereit 1 bis 25 Euro auszugeben. 20 Prozent"
			+ " lengthOf1 bis 50 Euro. 14 Prozent würden 51 bis 100 Euro ausgeben. 7 Prozent wären bereit 101 Euro und mehr auszugeben." + 
			"Es gibt eine Partei, die Klimaschutz seit längerem für sich verbuchen kann und die kann sich auch in dieser Sonntagsfrage "
			+ "behaupten. Die Grünen erreichen unverändert lengthOf1 Prozent und sind somit gleichauf mit der Union als stärkste Kräfte. Denn"
			+ " wenn am Sonntag Bundestagswahl wäre, käme die Union auf lengthOf1 Prozent (+1 Punkt im Verhältnis zum Vormonat), die SPD auf 12 "
			+ "Prozent (-1) und die AfD auf 14 Prozent (+1). Die FDP liegt unverändert bei 8 Prozent, die Linke kommt auf 7 Prozent (-1)."
			+ " Die Zufriedenheit mit der Bundesregierung verharrt auf niedrigem Niveau. Nur 32 Prozent sind mit der Arbeit der Bundesregierung "
			+ "zufrieden oder sehr zufrieden (+3 Punkte im Vergleich zum Vormonat). Eine deutliche Mehrheit von 67 Prozent der Befragten (-3) "
			+ "sind mit der Arbeit der Bundesregierung weniger oder gar nicht zufrieden. Auch die Neubesetzung an der Spitze des "
			+ "Verteidigungsministeriums kommt nicht so gut an. Gerade mal 16 Prozent der Befragten halten Annegret Kramp-Karrenbauer (CDU) "
			+ "für eine gute Besetzung als Verteidigungsministerin. 65 Prozent halten sie für keine gute Besetzung. Die Skepsis gegenüber "
			+ "Kramp-Karrenbauer ist also deutlich. Zum Vergleich: Ursula von der Leyen (CDU) stand zu Amtsantritt besser da. Damals, im "
			+ "Dezember 2013, hielten sie 40 Prozent für eine gute Besetzung, 43 Prozent nicht. Man muss auch klar sagen: Das waren damals "
			+ "schon keine guten Werte. Schaut man bei der neuen Verteidigungsministerin Kramp-Karrenbauer auf ihre eigenen Parteianhänger, "
			+ "wird deutlich, dass knapp die Hälfte der Unionsanhänger (49 Prozent) in ihr keine gute Besetzung sieht. Lediglich 38 Prozent "
			+ "der Unionsanhänger halten die CDU-Vorsitzende dagegen für eine gute Besetzung im Verteidigungsministerium." + 
			"Kramp-Karrenbauer erinnerte direkt zu Beginn ihrer Amtszeit daran, dass Deutschland dem Ziel der NATO, die Militärausgaben bis "
			+ "2024 in Richtung zwei Prozent des Bruttoinlandsprodukts zu erhöhen, eine klare Zusage gegeben habe. Das würde eine deutliche "
			+ "Erhöhung der Verteidigungsausgaben bedeuten. Die Hälfte der Befragten (50 Prozent) spricht sich dafür aus, dass Deutschland "
			+ "diesen Beschluss umsetzt und die Verteidigungsausgaben entsprechend erhöht. Dieser Vorschlag hat an Popularität gewonnen. "
			+ "50 Prozent der Befragten sind dafür, die Verteidigungsausgaben zu erhöhen. Das sind 7 Prozentpunkte mehr als im April, als die "
			+ "Frage zuletzt gestellt wurde. 46 Prozent der Befragten lehnen eine Erhöhung ab (-7). Bald jährt sich der Mauerfall zum 30. Mal. "
			+ "75 Prozent der Deutschen insgesamt sind mit der Entwicklung in Deutschland nach der Wiedervereinigung sehr beziehungsweise überwiegend "
			+ "zufrieden. Vergleicht man dabei Ost und West, ergeben sich Unterschiede: Im Westen des Landes ist der Anteil der Zufriedenen mit 77 Prozent "
			+ "etwas höher als im Osten. In den östlichen Bundesländern sind 68 Prozent mit der Entwicklung nach der Wiedervereinigung zufrieden. Das ist "
			+ "immer noch ein hoher Wert, allerdings hat hier eine Veränderung stattgefunden. Der Wert ist deutlich niedriger als im November 2017 als wir "
			+ "diese Frage zuletzt erhoben haben (-13). In den westlichen Bundesländern ist der Wert nahezu unverändert (-1). Regelmäßig stellt der "
			+ "DeutschlandTrend auch Fragen im Bereich Außenpolitik. Besonders interessant ist dabei in diesem Monat der Blick auf Großbritannien. 37 Prozent "
			+ "der Befragten halten Großbritannien für ein Land, dem man vertrauen kann. Das ist der tiefste Wert, der im DeutschlandTrend jemals für Großbritannien "
			+ "gemessen wurde. Im Februar hielten noch 54 Prozent der Befragten Großbritannien für vertrauenswürdig. Dazu passt, dass 67 Prozent der Befragten "
			+ "erwarten, dass sich unter dem neuen britischen Premierminister Boris Johnson das Verhältnis zwischen Großbritannien und der Europäischen Union "
			+ "verschlechtern wird. Kurz vor dem Auslaufen des INF-Vertrags über das Verbot landgestützter atomarer Mittelstreckenwaffen hat Bundesaußenminister "
			+ "Heiko Maas vor einem Wettrüsten gewarnt. \"Auch heute muss es uns wieder gelingen, Regeln zur Abrüstung und Rüstungskontrolle zu vereinbaren\", "
			+ "sagte der SPD-Politiker einer Mitteilung zufolge. \"Die Herausforderungen, vor denen wir jetzt stehen, sind durch das Ende des Vertrags größer geworden.\" "
			+ "Sie beschränkten sich nicht mehr nur auf Europa. Die USA hatten den Vertrag Anfang Februar zuerst gekündigt, kurz darauf dann Russland. Washington wirft Moskau "
			+ "vor, mit seinem neuen russischen Mittelstreckensystem 9M729 - von der NATO SSC-8 genannt - gegen das Abkommen verstoßen zu "
			+ "haben. Russland bestreitet das und beteuert, die Reichweite des Raketensystems liege unter 500 Kilometern. Überdies mahnte "
			+ "Maas: \"Auch Atommächte wie China müssen sich ihrer Verantwortung in der Rüstungskontrolle stellen, sie haben mehr Gewicht "
			+ "in der Welt als zu Zeiten des Kalten Kriegs.” Die Union im Bundestag sprach von einem \"düsteren Tag\". CDU-Außenpolitiker "
			+ "Jürgen Hardt sagte mit Blick auf die Vorwürfe gegen Moskau: \"Die NATO wird auf den Vertragsbruch Russlands wie angekündigt "
			+ "eine geschlossene, aber abgewogene Antwort geben.\" Deutschland habe kein Interesse an einem neuen Rüstungswettlauf in "
			+ "Europa. \"Aber wir müssen auf die neuen Bedrohungen von Seiten Russlands angemessen reagieren.” Rjabkow verwies darauf,"
			+ " dass sich Russland ein einseitiges Moratorium auferlegt habe, solche Raketen vorerst nicht zu stationieren. Allerdings "
			+ "seien weder die USA noch die NATO bisher auf den Vorschlag eines Moratoriums eingegangen. Der Diplomat richtete eine scharfe"
			+ " Warnung an die Adresse der NATO. Moskau schenke den Beteuerungen der NATO, dass es innerhalb des Bündnisses keine Pläne "
			+ "zur Stationierung nuklear bestückter Raketen in Europa gebe, keinen Glauben. \"Entsprechende Beteuerungen im Allgemeinen "
			+ "kann man sicherlich nicht glauben\", wurde Rjabkow zitiert. \"Das Bündnis hat wiederholt seine früheren Versprechungen Unionsfraktionsvize Carsten Linnemann fordert, dass Kinder ausrechend Deutsch sprechen müssen, bevor sie an der Grundschule aufgenommen werden. \"Um es auf den Punkt zu bringen: Ein Kind, das kaum Deutsch spricht und versteht, hat auf einer Grundschule noch nichts zu suchen\", sagte er der \"Rheinischen Post\" (Dienstag). Der CDU-Politiker schlägt für betroffene Kinder eine Vorschulpflicht vor. Notfalls müsse eine Einschulung auch zurückgestellt werden, sagte er. Der Deutsche Lehrerverband gibt ihm teilweise recht.\n" + 
			"Es müssten alle Alarmglocken schrillen, wenn bei Sprachtests wie in Duisburg mehr als 16 Prozent der künftigen Erstklässler gar kein Deutsch könnten, sagte Linnemann. \"Bis tief hinein in die Mittelschicht erlebe ich Eltern, die ihre Kinder auf Privatschulen schicken, weil das Niveau an staatlichen Schulen sinkt.\" Er warnte in dem Zusammenhang vor \"neuen Parallelgesellschaften\". \"Die Vorfälle in Freibädern, die Tat auf dem Frankfurter Bahnsteig, die Schwertattacke in Stuttgart - das alles wühlt die Menschen auf und befeuert die Sorge, dass neue Parallelgesellschaften entstehen könnten. Dem müssen wir jetzt vorbeugen.\"\n" + 
			"Bankrotterklärung der Politik"+
			"Der Präsident des Deutschen Lehrerverbands, Heinz-Peter Meidinger sagte der Deutschen Presse-Agentur am Montag, Linnemann habe natürlich Recht damit, dass die eigentliche sprachliche Förderung vor der Grundschule erfolgen müsste. Kinder sollten nach Meidingers Ansicht schon lange vor der Einschulung verpflichtende Sprachtests durchlaufen. \"Ich bin ein absoluter Anhänger von bundesweiten, flächendeckenden Sprachstandstests bei Drei- und Vierjährigen.\" Es gebe Ansätze dafür in einigen Ländern, aber leider passiere dann zu wenig, weil ausgebildetes Personal fehlten, und Grundschullehrer seien sowieso Mangelware.\n" + 
			"Kritik am Vorstoß des Unionsfraktionsvizes kommt vom Verband Bildung und Erziehung (VBE). Die Forderung, Kinder, die kein Deutsch könnten, nicht einzuschulen, sei eine Bankrotterklärung der Politik, sagte der VBE-Vorsitzende Udo Beckmann der dpa. Zudem sei sie diskriminierend. \"Denn es läuft doch darauf hinaus, dass vor allem Kinder mit Migrationshintergrund oder Fluchterfahrung zurückgestellt werden würden.\" Der VBE forderte mit Blick auf Sprachförderung von der Politik mehr Unterstützung für die Kitas. Fast alle Kinder gingen inzwischen vor der Einschulung dorthin. Aber trotz hohen Engagements der Erzieherinnen und Erzieher führten Gruppengrößen, unzureichende Personalschlüssel und fehlende Sprachexperten dazu, dass manche Kinder nicht angemessen gut Deutsch sprächen.\n" + 
			"Die schleswig-holsteinische Bildungsministerin Einst ging hier die legendäre Titanic vom Stapel. Jetzt beantragt die Werft Harland & Wolff in Großbritannien Insolvenz. Das Geld reicht aktuell nicht mehr aus, um sich auf Aufträge zu bewerben. \n" + 
			"\n" + 
			"Die Werft, in der die legendäre \"Titanic\" gebaut wurde, ist zahlungsunfähig. Das Unternehmen werde noch am Montag Insolvenz beantragen, sagte ein Sprecher von Harland & Wolff in Belfast der Deutschen Presse-Agentur. Der norwegische Eigner Dolphin Drilling, der die Werft bereits vor Monaten zum Verkauf gestellt hatte, habe selbst finanzielle Schwierigkeiten. Das Geld reiche auch nicht mehr, um sich auf zwei lukrative Aufträge – darunter vom britischen Verteidigungsministerium für den Bau von Fregatten – zu bewerben, sagte der Sprecher. \"Uns ist die Zeit ausgegangen.\" Die Werft hatte zuletzt Millionenverluste geschrieben, der Umsatz war eingebrochen.\n" + 
			"\n" + 
			"Nach Angaben von Gewerkschaften war eine millionenschwerer Vertrag mit einem Energieunternehmen in Reichweite, wie das örtliche Nachrichtenportal \"Belfast Live\" berichtete. Forderungen nach einer Verstaatlichung blieben unerfüllt.\n" + 
			"\n" + 
			"Mehr als 30.000 Beschäftigte in besten Zeiten\n" + 
			"\n" + 
			"Harland & Wolff leistet auch Reparatur- und Instandsetzungsarbeiten an Offshore-Plattformen. Die Werft beschäftigt noch 130 Menschen in Vollzeit, zu Hochzeiten waren es mehr als 30.000.\n" + 
			"\n" + 
			"Vor dem Eingangstor demonstrieren seit Tagen Arbeiter gegen die Schließung der berühmten Werft. Dort war die \"Titanic\" gebaut worden, die am 15. April 1912 während ihrer Jungfernfahrt im Nordatlantik sank. Dabei starben 1514 der mehr als 2000 Menschen an Bord. Außer der \"Titanic\" hat Harland & Wolff noch viele weitere bekannte Ozeanriesen erbaut, darunter mehrere britische Kriegsschiffe wie die \"HMS Belfast\". Karin Prien (CDU) wies den Vorstoß von Linnemann ebenfalls vehement zurück. Prien sprach in der \"Süddeutschen Zeitung\" (Dienstag) von \"populistischer Unfug\" und \"der völlig falsche Weg\". Diese Kinder gehörten vielmehr \"im Rahmen der Regelbeschulung\" in Deutsch-als-Zweitsprache-Klassen.";
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	static String englishData = "I could not unlove him now, merely because I found that he had ceased to notice me.here here here here here here here The two rounds of Democratic presidential debates, rather than bringing clarity to the primary or culling the "
			+ "field of 24 candidates, have instead laid bare the fragility of former Vice President Joseph R. Biden Jr. as a front-runner "
			+ "and showcased the divisions over ideology and identity in a party that appears united only in its desire to defeat President "
			+ "Trump. Having failed so far to dominate the debates, Mr. Biden tried on Thursday to quell liberal resistance to his candidacy "
			+ "by other means: He charged, in Detroit, that certain attacks from the left on his record and his policies amounted to attacks"
			+ " on former President Barack Obama and his legacy. After nearly 10 hours of nationally televised and often contentious candidate"
			+ " forums, the Democratic hopefuls and their voters are plainly torn over how best to take on Mr. Trump and how aggressive a "
			+ "program they should embrace, particularly on health care and immigration. And far from coalescing around a possible nominee,"
			+ " Democrats are also sharply divided over what kind of standard-bearer would best bridge the larger generational, gender and "
			+ "racial differences shaping the party in the 2020 race. I don’t think anybody is currently perceived as both appealing and"
			+ ",” said Diane Feldman, I could not unlove i am thirteen and full around the middle with bird legs and no chest, stuck halfway between child and girl. It is a summer of relentless heat. It comes on early and stays through the night—forces us to sleep in ragged fits with a washcloth pressed to our bellies. I am in the backyard of the Tavern with a pail, picking up cigarette butts. My mother runs the Tavern, and in the summer months it is my job to sweep the decks and clear the yard. Every morning I can hear her voice carrying out the open windows as she sings Carly Simon and washes glasses. And every afternoon Andy and I slip away to swim and fish and hike until the sun sinks down.\n" + 
			"The morning shadows have retreated and I am sweating through my tank top, my brown hair knotted on top of my head. Andy comes walking down the long dirt drive like he does every day in the summer. He calls “Poppy” from so far down the road I swear I could hear him in my sleep. Andy is the one who’s shown me our whole world up here in the Yaak, and every time he stands on the edge of a river or the lip of a canyon, he looks out over all of it and tells me it’s God’s country. He says that’s because there isn’t anything up here besides what God made, and although we haven’t got much, we have a lot more than anyone else: in these rivers and larch and mountains. And maybe it’s the rest of the world that’s got it backward. him now, merely because I found that he had ceased to notice me. a veteran Democratic pollster who said she saw Mr. Biden as having largely given up his advantage on "
			+ "the risk front. “He is still more moderate, he is still of a different generation and those things carry some advantages for "
			+ "him. But he may not still have the ‘low-risk choice’ advantage. Mr. Biden demonstrated his vulnerabilities in the two debates, repeatedly offering halting answers, though he performed better in Wednesday’s forum than in the first one in June. But on the stage on Wednesday and at an event on Thursday in Detroit, he also adopted a new strategy: defending Mr. Obama from direct and implicit criticism from some of the other Democratic candidates, particularly Bill Blasio, the mayor of New York, and Julián Castro, a former housing secretary. The rising tension over Mr. Obama’s legacy, most notably the Affordable Care Act, is a new crack in the party’s orthodoxy, as an ascendant progressive wing that favors transformative change raises questions about the incremental policies of the former president. After a few candidates used the Detroit debate to demand that Mr. Biden account for Mr. Obama’s record on issues such as deportations and free trade, Mr. Biden was joined by some of the former president’s advisers, who chastised the critics for committing political malpractice. The more time we spend attacking President Obama and his record and the less time we spend on what Donald Trump is doing to this country only serves to help one person — Donald Trump,” said Stephanie Cutter, a former top Obama campaign aide. “Everybody on that stage needs to keep that in mind.” David Axelrod, the architect of Mr. Obama’s political ascent, said Mr. Biden would be wise to “lean in” on his ties to the former president and to “confront those who are attacking the Obama policies.” But Mr. Axelrod added that Mr. Biden and the other center-left candidates in the race have so far proved unable to make a compelling, affirmative case for what he called “a reality-based candidacy” that was at once uplifting and pragmatic. We ran on ‘yes we can,’ and you’re not going to win on ‘no you can’t,’” he said, recalling the Obama catchphrase. Ms. Feldman, the pollster, said that a number of Democratic candidates had begun to stand out from the field — including Senators Elizabeth Warren of Massachusetts, Kamala Harris of California and Cory Booker of New Jersey — but that the overall trajectory of the race remained as fluid as ever.I think it may be a little less clear today than it was a week ago,” she said.Among the liberal candidates, Ms. Warren demonstrated her formidable intellect and hard-charging populism at the debates, and Senator Bernie Sanders of Vermont made a full-throated claim to being the architect and chief promoter of ambitious liberal ideas. They delighted many progressives but also left the moderate wing of the party uneasy with their embrace of ideas like eliminating private health insurance, part of an uncompromising agenda the centrists fear will lead to electoral ruin.The is an early seventh-century Anglo-Saxon ornament depicting a boar that probably was once part of the crest "
			+ "of a helmet. It was discovered in by a metal searching in the town of Horncastle, Lincolnshire. It was reported as found "
			+ "treasure and acquired for by the City and County Museum, where it is on permanent display. The fragment is long and made "
			+ "of silver. Its elongated head is semi-naturalistic, depicting a crouching quadruped on either side of the skull, divided "
			+ "by a mane along the centre. The boar's eyes are formed from garnet, and its eyebrows, skull, mouth, tusks, and snout are "
			+ "gilded. Its head is hollow; in the space underneath, which was filled with soil and plant matter when found, are three "
			+ "rivets that would have attached it to a larger object, probably a helmet. The fragment would probably have formed the "
			+ "crest terminal of one of the \"crested helmets\" used in Northern Europe during the sixth through eleventh centuries."
			+ " The boar's head terminal is one of several representations of the animal on contemporaneous helmets. Boars surmount the"
			+ " Benty Grange and Wollaston helmets, and form the ends of the eyebrows of the Sutton Hoo and perhaps York helmets. These"
			+ " evidence a thousand-years-long tradition in Germanic mythology associating boars with the deities, and protection. The "
			+ "Roman historian Tacitus suggested that the Baltic Aesti wore boar symbols in battle to invoke the protection of a mother"
			+ " goddess, and in the Anglo-Saxon epic Beowulf, the poet writes that boar symbols on helmets kept watch over the warriors"
			+ " wearing them. The fragment represents a boar's head. It is hollow, with a shell made of silver, parts of which are "
			+ "gilded, and has garnet eyes. The fragment is, and in style. The head is elongated, capped by a prominent mane dividing the "
			+ "skull, and terminates in a blunt snout, defined by three grooved and gilded lines. On each side above the snout are more"
			+ " grooved and gilded lines representing the mouth, which includes pointed tusks. The boar's two small eyes are formed with"
			+ " garnets, am am am am am am am am am am am am am am am am am am am am am am am "
			+ "am am am am am am am am am am am am am am am am am am am am am am am am am am am "
			+ "am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am am  set in"
			+ " beaded gold work with a double collar.  Two gilded eyebrows, cast in relief, are well clear of the eyes "
			+ "and set against the skull. This is also gilded, and repeats on either side the pattern of a crouching The figure's head "
			+ "is twisted am am am am am am am am am am am  backwards, its jaws biting across its body and back foot, which, like the front foot, has three toes. When the"
			+ " fragment was found it was filled with soil am am am am am am am am am am am  and plant roots. Three rivets on the underside—one near the mouth, two on "
			+ "the opposite end—would have served to attach it to a larger object, most likely am am am am am am am am am am am   a helmet. The boar was an important "
			+ "symbol in prehistoric Europe, where, according to the archaeologist Jennifer Foster, it was venerated, hunted and"
			+ " eaten ... for millennia, until its virtual extinction in recent historical time. Anglo-Saxon boar symbols follow a "
			+ "thousand years of similar iconography, coming after La Tène examples in the fourth century BC, Gaulish examples three "
			+ "centuries later, and Roman boars in the fourth century AD. They probably represent a fused tradition of European and "
			+ "Mediterranean cultures. The boar is said to have been sacred to a mother goddess figure among linguistically Celtic "
			+ "communities in Iron Age Europe, while the Roman historian Tacitus, writing around the first century AD, suggested that "
			+ "the Baltic Aesti wore boar symbols in battle to invoke her protection. Boar crested helmets are depicted on the "
			+ "Gundestrup cauldron, discovered in Denmark, and on a Torslunda plate from Sweden, made some five hundred years later. "
			+ "Though the Romans also included the boar in their stable of symbols—four legions, including the England-based twentieth, "
			+ "adopted it as their emblem—it was only one among many. The boar persisted in continental Germanic tradition during the"
			+ "nearly 400 years of Roman rule in Britain, such as in association with the Scandinavian gods and Its return to "
			+ "prominence in the Anglo-Saxon period, as represented by the boars from Benty Grange, Wollaston, Guilden Morden, and "
			+ "Horncastle, may therefore suggest the post-Roman introduction of a Germanic tradition from Europe, rather than the "
			+ "continuation of a tradition in Britain through 400 years of Roman rule. Whatever its precise symbolism, the Anglo-Saxon"
			+ " boar appears to have been associated with protection; the Beowulf poet makes this clear, writing that boar symbols on"
			+ " helmets kept watch over the warriors wearing them. When did Barack Obama become a Republican" + 
			" asking because, according to some folks on the debate stage in Detroit, support for policy positions like the public option, "
			+ "comprehensive immigration reform and trade agreements are now dismissed as Republican talking points. The same applies to "
			+ "asking practical questions about how proposals would be passed or paid for. That's not only a sign of how far left Democrats"
			+ " are moving but also a warning about how liberals risk reinforcing Donald Trump's playbook" + 
			"Of course, all this is absurd. Obama is the Democratic Party's most popular in living memory. Despite Republicans'"
			+ " relentless and often unhinged attacks on him as socialist and worse, it's now clear that he was a responsible center-left leader." + 
			"After inheriting the worst fiscal crisis since the Great Depression, Obama actually reduced the deficit in his second term and backed "
			+ "bipartisan reforms on stubborn issues like immigration. Many of his policy outreaches to Republicans were rebuffed, and it's "
			+ "because of the reflexive demonization of Obama that many Democrats today are saying that it's useless to reach out to Republicans."
			+ " I understand their frustration. But still, the ability to work with Republicans is the third quality that a CNN poll shows "
			+ "Democrats want most in their next president, the first being an ability to defeat Donald Trump. And that requires more than a "
			+ "purely play-to-the-base strategy that ignores independent swing voters. Let's not forget that passing Obamacare was a massive task. "
			+ "Obama proposed a public option as a more practical and popular alternative to the single-payer system that very few Democrats "
			+ "supported just a decade ago.\n" + 
			"The fact that, in crafting Obamacare, Obama essentially adopted a Heritage Foundation proposal that was first implemented by Mitt "
			+ "Romney in Massachusetts did not stop Republicans from absurdly attacking it as a \"government takeover of health care.\" And "
			+ " understandably fueled a lot of cynicism among Democrats who say they might as well now propose what they see as the real deal -- "
			+ "an actual government takeover of health care. Republicans' bad faith arguments have created the thing they feared." + 
			"But at a time when President Trump's Justice Department is actively arguing in court for a complete destruction of Obamacare "
			+ "that would leave die millions without insurance, a Democratic proposal to take away people's private insurance threatens to blur "
			+ "some of the clear distinctions between the two parties on this core issue. A public option is vastly more popular among Democrats"
			+ " and the general electorate than a play-to-the-base national health care takeover that would never pass Congress and prove staggeringly"
			+ " expensive to implement. Moreover, math isn't partisan: The idea that talking about the cost of a trillion plan over 10 years means you're "
			+ "feeding into Republican talking points is nonsense.\n" + 
			"The same logic applies to the current Democratic debate about immigration reform. It's become popular to propose decriminalizing illegal "
			+ "border crossings. But this only adds ballast to Trump's otherwise baseless argument that the Democrats support \"open borders.\" There "
			+ "is just no way that this disincentivizes illegal border crossing. And the argument that decriminalizing illegal border crossings is "
			+ "the only way to stop family separations ignores the fact that current laws have been on the books for almost a century and the shameful "
			+ "increase in family separations is the direct result of a Trump administration policy which no other president has enforced with the same enthusiasm.\n" + 
			"The right move is to back comprehensive immigration reform -- an earlier version of which every Democratic senator voted for, along with a "
			+ "handful of Republicans, including Lindsey Graham. It would increase border security while also finding a way to bring 11 million illegal "
			+ "immigrants out of the shadows, and it would permanently protect the Dreamers. The Dow (INDU) finished down 2.9%, or 767 points, falling below lengthOf1,000 points for the first time since June. It has fallen five sessions in a row, marking the worst losing streak since March.\n" + 
			"The benchmark S&P 500 (SPX) closed nearly 3% lower, also recording its worst day of the year. The index has declined for six days in a row for the first time since October.\n" + 
			"The Nasdaq Composite (COMP) finished down 3.5%, its biggest decline since October 24, 2018. The Nasdaq also logged its longest losing streak since November 2016, when it fell for nine-consecutive days in the lead-up to the presidential election.\n" + 
			"Last week, the S&P 500 and the Nasdaq Composite logged their worst week of the year.\n" + 
			"Hit particularly hard were tech stocks. Apple (AAPL), Intel (INTC), Microsoft (MSFT), Nvidia (NVDA) and Advanced Micro Devices (AMD) were among the biggest losers on Monday.\n" + 
			"The VIX (VIX) volatility index soared nearly 40% to a seven-month high. The CNN Business Fear & Greed Index is indicating \"Extreme Fear.\"\n" + 
			"Although Monday was a terrible day for the market, investors should put the losses into perspective. The Dow is still up more than 10% this year, while the S&P is up 13.5%. The Nasdaq has posted a gain of more than 16% in 2019 even after Monday's selloff.\n" + 
			"Asian markets all fell more than 1.6% Monday, and Hong Kong's Hang Seng closed down 2.9% as protests continue in the region. In Europe, London's FTSE 100 finished down 2.5%. Germany's DAX and France' Cac 40 closed 1.8% and 2.2% lower, respectively.\n" + 
			"US government bonds rose and yields fell as traders looked for safe investments. Bond prices and yields move opposite to one another.\n" + 
			"The 10-year Treasury yield declined to 1.7244%. The yield curve — the difference between shorter and longer-term bond yields — \"Risks of Trump intervening in foreign exchange markets have increased with China letting the yuan go,\" wrote Viraj Patel, FX and global macro strategist at Arkera, on Twitter. \"If this was an all out currency war - the US would hands down lose. Beijing [is] far more advanced in playing the currency game [and has] bigger firepower.\"\n" + 
			"President Donald Trump once again called China a currency manipulator on Monday, saying the yuan devaluation was a \"major violation.\" Trump has long attacked China for its currency policy, even though the Treasury has refrained from officially labeling the country a currency manipulator.\n" + 
			"China also announced Monday its companies have halted purchases of American agricultural goods. That helped to drive stocks even deeper into the red. grew the widest since April 2007. That inversion of the yield curve has predated every past recession.\n" + 
			"Escalating the trade war\n" + 
			"The yuan weakened sharply after the People's Bank of China set its daily reference rate for the currency at 6.9225, the lowest rate since December. The central bank said in a statement that Monday's weakness was mostly because of \"trade protectionism and new tariffs on China.\" President Donald Trump threatened a new round of tariffs on the country last week.\n" + 
			"Devaluing the yuan is one way China has of retaliating against the tariffs. A weaker currency helps Chinese manufacturers offset the costs of higher tariffs.\n" + 
			"Analysts at Capital Economics said the move showed that Beijing has \"all but abandoned\" hopes for a trade deal with the United States.\n" + 
			"In US economic data, the non-manufacturing index for July from the Institute of Supply Management undercut consensus expectations, which didn't help matters.";
	//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	static String spanishData = "Neil Alden Armstrong, más conocido como Neil Armstrong, fue un astronauta estadounidense y "
			+ "el primer ser humano en pisar la Luna. También, fue ingeniero aeroespacial, piloto de guerra, piloto de"
			+ " pruebas y profesor universitario. Cuando puso un pie en la superficie lunar, el 21 de julio de 1969, "
			+ "pronunció esta frase, que muy pronto se volvió célebre: Es un pequeño paso para un hombre, pero un gran "
			+ "salto para la humanidad. Se graduó en ingeniería aeronáutica en la Universidad Purdue, donde estudió con "
			+ "una beca del Plan Holloway de la Armada de los Estados Unidos. En 1949 ingresó en la marina estadounidense"
			+ " y al año siguiente se convirtió en aviador naval. Entró en combate en la guerra de Corea como piloto de "
			+ "cazas a reacción Grumman F9F Panther del portaaviones USS Essex y en septiembre de 1951 su avión resultó "
			+ "dañado por fuego antiaéreo durante un bombardeo a baja altitud, por lo que tuvo que eyectarse del aparato. "
			+ "Después de la guerra, completó sus estudios en Purdue y comenzó a trabajar como piloto de pruebas en el Centro "
			+ "de Vuelo de Alta Velocidad del Comité Asesor Nacional para la Aeronáutica (NACA), ubicado en la Base de la Fuerza "
			+ "Aérea Edwards, California. Allí fue piloto de los cazas del proyecto Century Series y voló en siete ocasiones en el"
			+ " avión cohete North American X-15. También participó en los programas Man in Space Soonest de la Fuerza Aérea de los "
			+ "Estados Unidos y en el Boeing X-20 Dyna-Soar de vuelo espacial tripulado, ambos enfocados en llevar un ser humano al "
			+ "espacio. Se unió al cuerpo de astronautas de la NASA en el segundo grupo de la agencia espacial, que fue seleccionado "
			+ "en 1962. Realizó su primer vuelo espacial como comandante de la Gemini 8 en marzo de 1966, con lo cual se convirtió en "
			+ "el primer astronauta civil en volar al espacio. Durante esta misión con el piloto David Scott realizó el primer "
			+ "acoplamiento de dos naves espaciales, pero esta tuvo que abortarse porque Armstrong usó parte del combustible de la "
			+ "reentrada para prevenir un peligroso giro causado por un propulsor bloqueado. El segundo y último vuelo espacial de "
			+ "Armstrong fue como comandante de la misión Apolo 11, el primer alunizaje tripulado. Durante los entrenamientos para la "
			+ "misión, se vio obligado a eyectarse de un vehículo de investigación de alunizajes segundos antes de estrellarse. En "
			+ "julio de 1969, Armstrong y el piloto del módulo lunar Buzz Aldrin descendieron a la superficie de la Luna y caminaron"
			+ " por esta durante dos horas y media mientras Michael Collins los esperaba orbitando en el módulo de mando y servicio. "
			+ "Los tres astronautas fueron galardonados con la Medalla Presidencial de la Libertad por el presidente Richard Nixon. "
			+ "En 1978, el presidente Jimmy Carter le concedió la Medalla de Honor Espacial del Congreso y en 2009 le entregaron la "
			+ "Medalla de Oro del Congreso de los Estados Unidos. Después de abandonar la NASA en 1971, aceptó un puesto de profesor "
			+ "en el Departamento de Ingeniería Aeroespacial de la Universidad de Cincinnati, donde impartió clases hasta 1979. Colaboró "
			+ "en la investigación del accidente del Apolo 13 y formó parte de la Comisión Rogers que investigó el siniestro del transbordador "
			+ "espacial Challenger en 1986. Además, fue portavoz de varias empresas y apareció en la publicidad del fabricante de coches Chrysler "
			+ "desde 1979. Falleció a los 82 años debido a complicaciones  “Buenos días. Mis compañeros estadounidenses, esta mañana nuestra nación está superada por el impacto, el horror y la tristeza. Este fin de semana más de 80 personas murierono resultaron heridas en dos malvados ataques.\n" +  
			"La mañana del sábado, en El Paso, Texas, un hombre malvado fue a una tienda Walmart, donde familias estaban comprando con sus seres queridos. Disparó y mató a 20 personas (NR:la cifra llegó a 22 muertos a mediodía del lunes) e hirió a otras lengthOf1, incluyendo preciosos niños pequeños.\n" + 
			"Luego, en las primeras horas del domingo en Dayton, Ohio, otro monstruo malvado abrió fuego en una concurrida calle del centro. Mató a nueve personas, incluyendo a su propia hermana, e hirió a otras 27\".\n" + 
			"El presidente se refirió desde el principio de su mensaje a los atancantes como \"monstruos desquiciados\", lo que presagiaba que no estaba dispuesto a adjudicar alguna responsabilidad de las masacres a la facilidad que tienen los estadounidenes para acceder a armas de alto poder de fuego, como las usadas en los dos eventos. De hecho, el presidente solo una vez usó la palabra 'control', al final de su intervención, y no lo hizo para referirse al comercio de armas de fuego, sino para hablar de la necesidad de la sociedad de manejar su destino.\n" + 
			"\"La primera dama y yo nos unimos a todos los estadounidenses en el rezo y la aflicción por las víctimas, sus familias y los sobrevivientes. Por siempre estaremos a su lado. Nunca olvidaremos.\n" + 
			"Estas matanzas bárbaras son un ataque contra Este es un punto en el que el presidente puede encontrar coincidencias entre republicanos y demócratas, quienes por igual, aunque por razones diferentes, recelan del gran poder que han adquirido las empresas de tecnología que controlan la vida en la web. Sin embargo, algunos defensores de los derechos ciudadanos advierten que es peligroso que los gobiernos quieran establecer controles al flujo de información que circula en el mundo virtual. Actualmente el Departamento de Justicia tiene bajo investigación a las grandes empresas tecnológicas de las que sospecha que incurren en prácticas monopólicas. La experiencia de 2016, cuando operarios rusos intervinieron en el debate político estadounidense con fines desestabilizadores, de acuerdo con los servicios de inteligencia, lleva a algunos a decir que las redes deben tener algún tipo de regulación. Pero eso se topa con quienes temen que sea un camino para limitar la libertad de expresión y comunicación de la sociedad.\n" + 
			"\"En las dos décadas desde Columbine, nuestra nación ha observado con creciente horror y pavor como un tiroteo masivo es seguido por otro, una y otra vez, década tras década.\n" + 
			"No podemos permitirnos sentirnos sin poder. Podemos y detendremos este contagio malvado. En esa labor, debemos honrar la sagrada memoria de quienes hemos perdido actuando como un pueblo. Las heridas abiertas no pueden sanar si estamos divididos. Debemos buscar soluciones reales y bipartidistas. Tenemos que hacer eso de manera bipartidista. Eso verdaderamente hará EEUU más seguro y mejor para todos. nuestras comunidades, un ataque contra nuestra nación y un crimen contra toda la humanidad. Estamos indignados y asqueados por esta maldad monstruosa, la crueldad, el odio, la malicia, la matanza y el terror. Nuestros corazones están destrozados por cada familia cuyos padres, niños, esposos y esposas fueron arrancados de sus brazos y sus vidas. Estados Unidos llora los caídos\". de un baipás coronario. Armstrong fue llamado a filas con dieciocho años "
			+ "el lengthOf1 de enero de 1949 por la Armada. Ingresó en la base aérea de Pensacola para iniciar la formación de piloto. Después de superar "
			+ "las pruebas médicas, ingresó en la Armada como guardiamarina el 24 de febrero de 1949. La formación de piloto naval la realizó en el"
			+ " avión de entrenamiento North American T-6 Texan, a los mandos del cual realizó su primer vuelo en solitario el 9 de septiembre de 1949."
			+ " El 2 de marzo de 1950 llevó a cabo su primer aterrizaje en un portaaviones sobre el USS Cabot, una hazaña que él comparó con su primer "
			+ "vuelo en solitario. Después fue destinado a la Estación Aérea Naval de Corpus Christi (Texas) para formarse pilotando el caza Grumman "
			+ "F8F Bearcat, entrenamiento que culminó con el aterrizaje sobre el portaaviones USS Wright. El 16 de agosto de 1950, unos días después "
			+ "de cumplir veinte años, Armstrong recibió una carta en la que se le informaba que estaba completamente cualificado como aviador naval. "
			+ "Su madre y su hermana asistieron a su ceremonia de graduación el 23 de agosto de 1950.Su primer destino fue el Escuadrón 7 del "
			+ "Servicio Aéreo de la Flota en la Base Aeronaval de San Diego. Dos meses después fue asignado al Escuadrón de Cazas 51 (VF-51), "
			+ "equipado con aviones de reacción, y realizó su primer vuelo en este tipo de aparatos el 5 de enero de 1951 a bordo de un F9F-2B "
			+ "Panther. El 5 de junio de 1951 fue ascendido a alférez y dos días después aterrizó por vez primera en un portaaviones a los mandos"
			+ " de un avión a reacción, sobre el USS Essex. A finales de mes, el Essex zarpó con el VF-51 a bordo rumbo a Corea, donde sus cazas "
			+ "embarcados realizarían ataques a tierra. A finales de julio el VF-51 llevó a cabo un entrenamiento de ataque en la Estación Aérea Naval "
			+ "de Barbers Point, en Hawái \"Papi, estoy mareado\", le dijo el boxeador argentino Hugo Alfredo Santillán a su padre y entrenador, también"
			+ " Hugo Alfredo Santillán, mientras el anunciador leía las tarjetas de los jurados que daban como empate a una pelea televisada para "
			+ "todo el país desde San Nicolás, a 240 kilómetros de Buenos Aires, el sábado 20 de julio. Entonces, Santillán hijo se desplomó. Y "
			+ "aunque alcanzó a responderle al médico cómo se llamaba, en la ambulancia camino al hospital entró en coma y ya no recobró más la "
			+ "conciencia. Con el cerebro hinchado, insuficiencia renal sucesiva y dos paros cardíacos, murió cuatro días después, víctima de una "
			+ "pelea con la que habría cobrado 55.000 pesos argentinos (1.100 euros, 1.240 dólares), poco más de los 45.000 pesos que costó su sepelio."
			+ "La muerte de Dinamita Santillán, ex campeón sudamericano de 23 años y padre de tres hijos, es uno de esos casos en los que una avalancha "
			+ "de fatalidades se alinean para converger en la gran tragedia final. Pero es, también, la muestra de la indefensión que sufre la enorme "
			+ "mayoría de boxeadores en Argentina, que ni siquiera cuentan con un sindicato que se preocupe por agruparlos y generarles mínimas condiciones "
			+ "económicas y laborales." + 
			"" + 
			"Santillán, según coinciden varios especialistas, no debió haber peleado la noche de su combate mortal contra el uruguayo Eduardo Abreu por "
			+ "uno de esos títulos que el boxeo moderno encuentra debajo de las piedras: el latino plata ligero de una de las cuatro organizaciones principales. "
			+ "Poco más de un mes antes, el 15 de junio, el argentino había sufrido una golpiza en Hamburgo (Alemania), en un combate que perdió contra"
			+ " el armenio Artem Harutyunyan y por el que ingresó 4.000 euros. Era una fortuna para el mercado local, aproximadamente lo que podría haber"
			+ " ganado en dos años de boxeo en Argentina. Voy a dejar mi vida. Peleo por mis hijos así que voy a matar o a que me maten, había escrito "
			+ "Santillán en sus redes sociales el 10 de junio, antes de subirse al avión."
			+ "Pero el costo de su experiencia europea fue infinitamente superior: Santillán debió combatir tres categorías por encima de su peso habitual. "
			+ "Si en Argentina peleaba en pluma o superpluma, categorías que oscilan entre 57 y 59 kilos, en Alemania enfrentó a un rival superligero, que"
			+ "Los responsables de estos tres ataques compartieron en esa página contenidos provocadores, manifiestos racistas y cartas abiertas donde hablaban de sus planes para perpetrar actos violentos. El mensaje que dejó en el sitio el supuesto autor de la masacre de El Paso advertía específicamente de una \"invasión de hispanos en Texas\", la comunidad que fue foco de su ataque.\n" + 
			"\n" + 
			"El presidente Donald Trump advirtió este lunes durante su discurso tras los tiroteos del fin de semana sobre los peligros de este tipo de plataformas y la falta de regulación. \"Tenemos que reconocer que el Internet ha provisto una peligrosa vía para radicalizar, perturbar mentes y cometer actos dementes. Tenemos que iluminar los recovecos oscuros de Internet y detener los tiroteos masivos antes de que empiecen\", aseguró.\n" + 
			"\n" + 
			"Entonces, ¿por qué una web como esta sigue activa? Aunque ha estado bajo el ojo del huracán en los últimos meses por otras masacres vinculadas a contenidos allí promovidos, hasta ahora se están tomando medidas al respecto. La empresa de seguridad e infraestructura digital Cloudflare dijo que no seguirá prestándole sus servicios, por lo que este lunes ha habido apagones intermitentes en la página; sin embargo su administrador informó que ya encontraron otro proveedor.\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"\n" + 
			"Esto es lo que tienes que saber para entender todo lo que gira en torno a 8chan:\n" + 
			"\n" + 
			"¿Qué es 8chan?\n" + 
			"Es una página de Internet abierta en 2013 donde los usuarios pueden publicar imágenes, textos y contenido de todo tipo en su 'tablero' (un estilo de foro con orígenes en Japón), donde también interactúan con otros participantes. No tiene reglas como otros foros o moderadores o restricciones.\n" + 
			"\n" + 
			"PUBLICIDAD\n" + 
			"\n" + 
			"Aunque fue creado para hablar de cualquier tema, desde videojuegos, política o colecciones de trenes; el hecho de que se postea de manera anónima para facilitar las discusiones, lo ha convertido en un sitio sin filtros donde se promueve pornografía, teorías de la conspiración y ahora es el centro de discusiones racistas, de odio y supremacismo blanco.\n" + 
			"\n" + 
			"Su única regla: no se puede publicar nada que sea ilegal en Estados Unidos como imágenes de explotación infantil. Pero en esta web nadie puede censurar ni eliminar nada, ni sus administradores, lo que usualmente sí hacen las redes sociales como Facebook o Twitter y foros online a través de moderación de contenido. La razón por la que es allí a donde llegan los extremistas que no encuentran lugar en el resto de plataformas por las regulaciones.\n" + 
			"\n" + 
			" pesó 63,50 el día previo a la velada pero que después contó con 24 horas para rehidratarse y alimentarse: en ese lapso, los boxeadores que "
			+ "necesitan bajar de peso para no sobrepasar el límite suelen recuperar hasta seis kilos. Sumados a los dos de diferencia que arrastraba desde "
			+ "el pesaje, ¿Quién es el creador?\n" + 
			"8chan surgió en 2013 como un foro de Internet que aspiraba a ser la \"utopía de la libertad de expresión\", pero que hoy en día su mismo fundador, el programador de sistemas Frederick Brennan, reconoce que \"no le está haciendo ningún bien al mundo\" y ha pedido que la cierren, pero él ya no es el dueño.\n" + 
			"\n" + 
			"Ahora el sitio es propiedad de Jim Watkins, un veterano estadounidense que vive en Filipinas, y es administrado por su hijo Ronald Watkins.\n" + 
			"\n" + 
			"Aunque Brennan se ha querido distanciar de la página y su contenido, y ya no tiene poder sobre esta, no puede evitar que cada que haya un tiroteo masivo lo llamen todos los medios. \"Solo quiero volver a hacer mis fuentes en paz y no tener que preocuparme por recibir llamadas de CNN/New York Times cada vez que ocurre un titoteo masivo. Ellos pudieron haber prevenido esto y eligieron no hacerlo\", escribió en Twitter este domingo. el argentino subió al cuadrilátero con una desventaja abismal. O criminal.";
	double[] blank = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] a = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] b = {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] c = {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] d = {0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] e = {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] f = {0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] g = {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] h = {0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] i = {0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] j = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] k = {0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] l = {0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] m = {0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] n = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0};
	double[] o = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0};
	double[] p = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};
	double[] q = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0};
	double[] r = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0};
	double[] s = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0};
	double[] t = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
	double[] u = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0};
	double[] v = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0};
	double[] w = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0};
	double[] x = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0};
	double[] y = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0};
	double[] z = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

	int maxWordLength;

	ParseParagraphs(int maxWordLength, int numLanguages) {
		super(26*maxWordLength,numLanguages);
		this.maxWordLength = maxWordLength;
	}

	public double[][] parseOne(String data)
	{
		ArrayList<String> dataStrArray = sanitizeAndParse(data);
		return parseStringArrayToIntArray(dataStrArray);
	}

	public double[][] parseUserInput(String input) {
		ArrayList<String> dataStrArray = sanitizeAndParse(input);
		return parseStringArrayToIntArray(dataStrArray);
	}

	public double[][][] add(double[][][] array1, double[][] additionalArray)
	{
		double[][][] concatArray = new double[array1.length+1][][];
		int count = 0;
		for(double[][] x: array1)
		{
			concatArray[count] = x;
			count++;
		}
		concatArray[array1.length] = additionalArray;
		return concatArray;
	}

	public String unparseData(double[] data)
	{
		String str = "";
		for(int i = 0; i < data.length; i+=26)
			str+= arrayToString(subArray(data,i,i+26));
		return str;
	}

	public String arrayToString(double[] data)
	{
		if(Arrays.equals(data, a))
			return  "a";
		else if(Arrays.equals(data, b))
			return  "b";
		else if(Arrays.equals(data, c))
			return  "c";
		else if(Arrays.equals(data, d))
			return  "d";
		else if(Arrays.equals(data, e))
			return  "e";
		else if(Arrays.equals(data, f))
			return  "f";
		else if(Arrays.equals(data, g))
			return  "g";
		else if(Arrays.equals(data, h))
			return  "h";
		else if(Arrays.equals(data, i))
			return  "i";
		else if(Arrays.equals(data, j))
			return  "j";
		else if(Arrays.equals(data, k))
			return  "k";
		else if(Arrays.equals(data, l))
			return  "l";
		else if(Arrays.equals(data, m))
			return  "m";
		else if(Arrays.equals(data, n))
			return  "n";
		else if(Arrays.equals(data, o))
			return  "o";
		else if(Arrays.equals(data, p))
			return  "p";
		else if(Arrays.equals(data, q))
			return  "q";
		else if(Arrays.equals(data, r))
			return  "r";
		else if(Arrays.equals(data, s))
			return  "s";
		else if(Arrays.equals(data, t))
			return  "t";
		else if(Arrays.equals(data, u))
			return  "u";
		else if(Arrays.equals(data, v))
			return  "v";
		else if(Arrays.equals(data, w))
			return  "w";
		else if(Arrays.equals(data, x))
			return  "x";
		else if(Arrays.equals(data, y))
			return  "y";
		else if(Arrays.equals(data, z))
			return  "z";
		return "";
	}

	public double[][][] concat(double[][][] array1, double[][][] array2)
	{
		if(array1 == null)
			return array2;
		if(array2 == null)
			return array2;
		double[][][] accumulator = array1;
		for(double[][] x: array2)
			accumulator = add(accumulator,x);
		return accumulator;
	}

	public double[][] parseStringArrayToIntArray(ArrayList<String> dataArray)
	{	
		ArrayList<ArrayList<Double>> list = new ArrayList<ArrayList<Double>>();
		ArrayList<Double> word;
		for(int i = 0; i < dataArray.size(); i++)
		{
			word = parseStringToIntArray(dataArray.get(i));
			list.add(word); 
		}

		double[][] intArray = new double[dataArray.size()][lengthOfInput];
		for(int j = 0; j < list.size(); j++)
		{
			for(int i = 0; i < lengthOfInput; i++)
				intArray[j][i] = list.get(j).get(i);
		}
		return intArray;
	}

	public ArrayList<Double> parseStringToIntArray(String string) {
		double[][] letters = new double[maxWordLength][lengthOfInput];
		Arrays.fill(letters, blank);

		for(int ii = 0; ii < string.length(); ii++)
		{
			if(string.charAt(ii) == 'a')
				letters[ii] =  a;
			else if(string.charAt(ii) == 'b')
				letters[ii] =  b;
			else if(string.charAt(ii) == 'c')
				letters[ii] =  c;
			else if(string.charAt(ii) == 'd')
				letters[ii] =  d;
			else if(string.charAt(ii) == 'e')
				letters[ii] =  e;
			else if(string.charAt(ii) == 'f')
				letters[ii] =  f;
			else if(string.charAt(ii) == 'g')
				letters[ii] =  g;
			else if(string.charAt(ii) == 'h')
				letters[ii] =  h;
			else if(string.charAt(ii) == 'i')
				letters[ii] =  i;
			else if(string.charAt(ii) == 'j')
				letters[ii] =  j;
			else if(string.charAt(ii) == 'k')
				letters[ii] =  k;
			else if(string.charAt(ii) == 'l')
				letters[ii] =  l;
			else if(string.charAt(ii) == 'm')
				letters[ii] =  m;
			else if(string.charAt(ii) == 'n')
				letters[ii] =  n;
			else if(string.charAt(ii) == 'o')
				letters[ii] =  o;
			else if(string.charAt(ii) == 'p')
				letters[ii] =  p;
			else if(string.charAt(ii) == 'q')
				letters[ii] =  q;
			else if(string.charAt(ii) == 'r')
				letters[ii] =  r;
			else if(string.charAt(ii) == 's')
				letters[ii] =  s;
			else if(string.charAt(ii) == 't')
				letters[ii] =  t;
			else if(string.charAt(ii) == 'u')
				letters[ii] =  u;
			else if(string.charAt(ii) == 'v')
				letters[ii] =  v;
			else if(string.charAt(ii) == 'w')
				letters[ii] =  w;
			else if(string.charAt(ii) == 'x')
				letters[ii] =  x;
			else if(string.charAt(ii) == 'y')
				letters[ii] =  y;
			else if(string.charAt(ii) == 'z')
				letters[ii] =  z;
		}

		ArrayList<Double> list = new ArrayList<Double>();

		for(int ii = 0; ii < letters.length; ii++)   
			for(int jj = 0; jj < letters[0].length; jj++)   
				list.add(letters[ii][jj]);
		return list;
	}

	public ArrayList<String> sanitizeAndParse(String data)
	{
		data = deAccent(data);
		data = data.replaceAll("[^a-zA-Z ]", " ");
		String[] dataArray = data.split(" ");
		ArrayList<String> sanitizedDataArray = new ArrayList<String>();
		for(String x: dataArray)
		{
			try {
				if(x.length() < 1 || x.length() > maxWordLength|| x == "n")
				{
					System.out.println("Invalid charecter or word removed");
					continue;
				}
				else if(!Character.isUpperCase(x.charAt(0)))
					sanitizedDataArray.add(x);

			}
			catch(Exception e)
			{
				System.out.println("invalid string: \"" + x + "\"");
				throw e;
			}
		}
		return sanitizedDataArray;
	}

	public String deAccent(String str) {
		String nfdNormalizedString = Normalizer.normalize(str, Normalizer.Form.NFD); 
		Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		return pattern.matcher(nfdNormalizedString).replaceAll("");
	}

	public double[] subArray(double[] array, int start, int end)
	{
		double[] sub = new double[end-start];
		for(int i = start; i < end; i++)
		{
			sub[i%26] = array[i];
		}
		return sub;
	}


	public String outputTToString(String t) {
		return t;
	}
}
