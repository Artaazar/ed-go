<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:i10n="org.c3s.edgo.utils.I10N">
	<xsl:output encoding="utf-8" indent="yes" method="html"/>
	<xsl:include href="../ranks.xsl"/>
	<xsl:param name="root"/>
	<xsl:param name="politic"/>
	<xsl:param name="language_id"/>
	<xsl:param name="default"/>
	<xsl:param name="suffix"/>
	<xsl:param name="tournaments"/>
	<xsl:param name="roles"/>
	<xsl:param name="mode"/>
	<xsl:param name="pilot"/>
	<xsl:template match="/*">
		<xsl:choose>
			<xsl:when test="$mode = 'info'"><xsl:call-template name="view_info"/></xsl:when>
			<xsl:when test="$mode = 'ships'"><xsl:call-template name="view_ships"/></xsl:when>
			<xsl:when test="$mode = 'view_ship'"><xsl:call-template name="view_ship"/></xsl:when>
			<xsl:when test="$mode = 'view_power'"><xsl:call-template name="view_power"/></xsl:when>
			<xsl:when test="$mode = 'view_missions'"><xsl:call-template name="view_missions"/></xsl:when>
			<xsl:when test="$mode = 'locations'"><xsl:call-template name="view_locations"/></xsl:when>
		</xsl:choose>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_info">

		<div class="clearfix"></div>
		<!-- Location -->
		<div class="x_panel">
			<div class="x_title">
				<h2>
					<xsl:value-of select="i10n:tr('Last location')"/>
					<small></small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<table class="table ">
					<tr>
						<td class="col-md-1">System:</td>
						<td>
							<xsl:value-of
								select="item[@name='location']/field[@name='systemName']/@value"
								disable-output-escaping="yes" />
						</td>
					</tr>
					<tr>
						<td class="col-md-1">Station:</td>
						<td>
							<xsl:value-of
								select="item[@name='location']/field[@name='stationName']/@value"
								disable-output-escaping="yes" />
						</td>
					</tr>
				</table>
			</div>
		</div>
		<div class="clearfix"></div>
		<!-- Ranks -->
		<div class="x_panel">
			<div class="x_title">
				<h2>
					Ranks
					<small></small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<!-- Combat -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='combat']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>Combat</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="combat">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='combat']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
				<!-- Trade -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='trade']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>Trade</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="trade">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='trade']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
				<!-- Explore -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='explore']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>Explore</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="explore">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='explore']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
				<!-- CQC -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='cqc']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>CQC</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="cqc">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='cqc']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
				<!-- empire -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='empire']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>Empire</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="empire">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='empire']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
				<!-- federation -->
				<div class="col-md-3 col-xs-12 widget widget_tally_box">
					<xsl:variable name="percent"
						select="item[@name='progress']/field[@name='federation']/@value" />
					<div class="x_panel ui-ribbon-container fixed_height_250">
						<div class="x_title">
							<h2>Federation</h2>
							<div class="clearfix"></div>
						</div>
						<div class="x_content">

							<div style="text-align: center; margin-bottom: 17px">
								<span class="chart" data-percent="{$percent}">
									<span class="percent"></span>
								</span>
							</div>

							<h3 class="name_title">
								<xsl:call-template name="federation">
									<xsl:with-param name="rank"
										select="number(item[@name='rank']/field[@name='federation']/@value)" />
									<xsl:with-param name="lang" select="$language_id" />
								</xsl:call-template>
							</h3>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
		<!-- Activity -->
		<div class="x_panel">
			<div class="x_title">
				<h2>
					Activity
					<small>monthly</small>
				</h2>
				<div class="filter">
					<div id="select-month" class="pull-right data" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
						<input id="date-selected" class="form-control hidden" type="text" style="border:none;" value="{/*/@maxdate}"/>
						<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
						<span style="padding-left: 5px; padding-right: 5px;"><xsl:value-of select="/*/@currentdate"/></span>
						<b class="caret"></b>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<canvas id="mybarChart" height="25"></canvas>
			</div>
		</div>
		<script>
			$(function() {
				$('.chart').easyPieChart({
					easing: 'easeOutElastic',
					delay: 3000,
					barColor: '#26B99A',
					trackColor: '#fff',
					scaleColor: false,
					lineWidth: 20,
					trackWidth: 16,
					lineCap: 'butt',
					onStep: function(from, to, percent) {
						$(this.el).find('.percent').text(Math.round(percent));
					}
				});
				
				var lastdate = moment(Date.parse("<xsl:value-of select="/*/@maxdate"/>").getTime());
				var pilot = '<xsl:value-of select="$pilot"/>';
				
				var mybarChart = null;
				
				var setDateLabel = function(date) {
					//var m = moment(date.getTime());
					//console.log(m.locale());
					var month = date.format('MMMM');
					var year = ' ' + date.year();
					$("#select-month").find("span").html(month + year);
				} 
				
				setDateLabel(lastdate);
				
				//console.log(lastdate.getMonth());
				var drawChart = function(date, callback) {
					var month_year = '' + date.format('YYYY-MM');
					var checkDate = new Date(date.year(), date.month() + 1, 0);
					var data = {
						showdate: month_year,
					};
					//console.log(data);
					proxy.makeCall('post', '/ajax/pilots/'+ pilot + '/activity/', null, null, data, function(result) {
						if (result.error || result.status == 403) {
						} else {
							var _labes = [];
							var _data = [];
							for(i=1; i &lt;= checkDate.getDate(); i++) {
								_labes.push(i);
								_data.push(0);
							}
							for(i=0; i &lt; result.days.length; i++) {
								var current = result.days[i];
								_data[current.eventDate - 1] = current.times;
							}
							if (mybarChart != null) {
								mybarChart.destroy();
							}
						    var ctx = document.getElementById("mybarChart");
						    mybarChart = new Chart(ctx, {
						      type: 'bar',
						      data: {
						        labels: _labes,
						        datasets: [{
						          label: '# hours in game',
						          backgroundColor: "#03586A",
						          data: _data
						        }]
						      },
						
						      options: {
						        scales: {
						          yAxes: [{
						            ticks: {
						              beginAtZero: true
						            }
						          }]
						        }
						      }
						   });
						   if (callback) {
						   	callback();
						   }
						}
					});
					return false;
				}
				
				drawChart(lastdate);
				
				$("#select-month").datetimepicker({
					format: "YYYY-MM",
                	viewMode: 'months',
					maxDate: "<xsl:value-of select="/*/@maxdate"/>".replace(/\-\d+$/, ''),
					minDate: "<xsl:value-of select="/*/@mindate"/>".replace(/\-\d+$/, ''),
            	}).on('dp.change', function(e) {
            		//console.log(e.date);
            		setDateLabel(e.date);
            		drawChart(e.date);
            	});
            	
            	$("#select-month").on('click', function() {
            		$("#select-month").data("DateTimePicker").viewMode('months');
            		$("#select-month").data("DateTimePicker").toggle();
            	});
				
			});
		</script>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_ships">
	
		<xsl:variable name="lang"><xsl:value-of select="$root"/><xsl:if test="$politic = 'suffix' and $default != 'true'">/<xsl:value-of select="$suffix"/></xsl:if></xsl:variable>
		<div><h3><xsl:value-of select="field[@name='pilotName']/@value"/></h3></div>

		<div>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Ship</th>
						<th>System/Station</th>
						<th>#</th>
						<th>Ship</th>
						<th>System/Station</th>
					</tr>
				</thead>
				<tbody>
					<xsl:for-each select="childs/item">
						<!--
						<xsl:sort case-order="upper-first" data-type="text" order="ascending" select="field[@name='ship']/field[@name='name']/@value"/>
						-->
						<xsl:variable name="class">
							<xsl:if test="field[@name='isMain']/@value = 1">1</xsl:if>
						</xsl:variable>
						<xsl:if test="position() mod 2 = 1"><xsl:text disable-output-escaping="yes">&lt;tr&gt;</xsl:text></xsl:if>
							<td>
								<xsl:if test="$class = 1"><xsl:attribute name="class">success</xsl:attribute></xsl:if>
								<xsl:value-of select="field[@name='linkShipId']/@value"/>
							</td>
							<td>
								<xsl:if test="$class = 1"><xsl:attribute name="class">success</xsl:attribute></xsl:if>
								<a href="{$lang}/{../../field[@name='pilotName']/@value}/ships/{field[@name='linkShipId']/@value}/">
									<xsl:value-of select="field[@name='shipName']/@value"/>
								</a>
							</td>
							<td>
								<xsl:if test="$class = 1"><xsl:attribute name="class">success</xsl:attribute></xsl:if>
								<xsl:choose>
									<xsl:when test="string-length(field[@name='systemName']/@value) != 0">
										<xsl:value-of select="field[@name='systemName']/@value"/><br/>
										<xsl:value-of select="field[@name='stationName']/@value"/>
									</xsl:when>
									<xsl:otherwise>
										<xsl:value-of select="/item/item[@name='location']/field[@name='systemName']/@value"/><br/>
										<xsl:value-of select="/item/item[@name='location']/field[@name='stationName']/@value"/>
									</xsl:otherwise>
								</xsl:choose>
							</td>
						<xsl:if test="position() mod 2 = 0"><xsl:text disable-output-escaping="yes">&lt;/tr&gt;</xsl:text></xsl:if>
					</xsl:for-each>
					<xsl:if test="count(childs/item) mod 2 = 1"><td colspan="3"></td><xsl:text disable-output-escaping="yes">&lt;/tr&gt;</xsl:text></xsl:if>
				</tbody>
				
			</table>

		
		</div>
	
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_ship">
		<xsl:variable name="lang"><xsl:value-of select="$root"/><xsl:if test="$politic = 'suffix' and $default != 'true'">/<xsl:value-of select="$suffix"/></xsl:if></xsl:variable>
		<table class="table">
			<thead>
				<tr>
					<th class="col-md-3">Weapon</th>
					<th class="col-md-3">Utility</th>
					<th class="col-md-3">Essential</th>
					<th class="col-md-3">Internal</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>
						<xsl:for-each select="item[@name='currentShip']/modules/item[field[@name='slotTypeId']/@value='50']">
							<xsl:sort case-order="upper-first" data-type="text" order="ascending" select="field[@name='slotUniq']/@value"/>
							<div><xsl:call-template name="module_name"/></div>
						</xsl:for-each>
					</td>
					<td>
						<xsl:for-each select="item[@name='currentShip']/modules/item[field[@name='slotTypeId']/@value='10']">
							<xsl:sort case-order="upper-first" data-type="text" order="ascending" select="field[@name='slotUniq']/@value"/>
							<div><xsl:call-template name="module_name"/></div>
						</xsl:for-each>
					</td>
					<td>
						<xsl:for-each select="item[@name='currentShip']/modules/item[field[@name='slotTypeId' and (@value='30' or @value='40')]]">
							<xsl:sort case-order="upper-first" data-type="text" order="ascending" select="field[@name='slotUniq']/@value"/>
							<div><xsl:call-template name="module_name"/></div>
						</xsl:for-each>
					</td>
					<td>
						<xsl:for-each select="item[@name='currentShip']/modules/item[field[@name='slotTypeId']/@value='20']">
							<xsl:sort case-order="upper-first" data-type="text" order="ascending" select="field[@name='slotUniq']/@value"/>
							<div><xsl:call-template name="module_name"/></div>
						</xsl:for-each>
					</td>
				</tr>
			</tbody>
		</table>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="module_name">
		<xsl:choose>
			<xsl:when test="string-length(field[@name='moduleName']/@value) = 0">
				<xsl:value-of select="field[@name='moduleGroupName']/@value"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="field[@name='moduleName']/@value"/>
			</xsl:otherwise>
		</xsl:choose>		
		<xsl:text> - </xsl:text><xsl:value-of select="field[@name='moduleRating']/@value"/><xsl:value-of select="field[@name='moduleClass']/@value"/>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_power">
		<xsl:variable name="lang"><xsl:value-of select="$root"/><xsl:if test="$politic = 'suffix' and $default != 'true'">/<xsl:value-of select="$suffix"/></xsl:if></xsl:variable>
		<div><h3><xsl:value-of select="field[@name='pilotName']/@value"/></h3></div>

		<div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th rowspan="2">Week Start Time</th>
						<th colspan="3">Merits</th>
						<th rowspan="2">Credits Spend</th>
					</tr>
					<tr>
						<th>Delivery</th>
						<th>Killing</th>
						<th>Expansion</th>
					</tr>
				</thead>
				<tbody>
					<xsl:for-each select="item[@name='powers']/weeks/item">
						<xsl:variable name="week"><xsl:value-of select="field[@name='startWeek']/@value"/></xsl:variable>
						<xsl:variable name="week_pos" select="position()"/>
						<tr>
							<td><xsl:value-of select="$week"/></td>	
							<td>
								<xsl:for-each select="/*/item[@name='powers']/meritsDeliver/item[field[@name='startWeek']/@value = $week]">
									<xsl:value-of select="field[@name='quantitySumm']/@value"/> / <xsl:value-of select="field[@name='systemName']/@value"/><br/>
								</xsl:for-each>
							</td>	
							<td>
								<xsl:for-each select="/*/item[@name='powers']/meritsKill/item[field[@name='startWeek']/@value = $week]">
									<xsl:value-of select="number(field[@name='quantitySumm']/@value) * 30"/> / <xsl:value-of select="field[@name='systemName']/@value"/><br/>
								</xsl:for-each>
							</td>	
							<td>
								<xsl:for-each select="/*/item[@name='powers']/meritsWar/item[field[@name='startWeek']/@value = $week]">
									<xsl:choose>
										<xsl:when test="$week_pos = 1">
											<xsl:choose>
												<xsl:when test="field[@name='isConfirmed']/@value = 1">
													<xsl:value-of select="number(field[@name='quantitySumm']/@value) * 10"/> / <xsl:value-of select="field[@name='systemName']/@value"/><br/>
												</xsl:when>
												<xsl:otherwise>
													<strike><xsl:value-of select="number(field[@name='quantitySumm']/@value) * 10"/></strike> / <xsl:value-of select="field[@name='systemName']/@value"/><br/>
												</xsl:otherwise>
											</xsl:choose>
										</xsl:when>
										<xsl:otherwise>
											<xsl:choose>
												<xsl:when test="field[@name='isConfirmed']/@value = 1">
													<xsl:value-of select="number(field[@name='quantitySumm']/@value) * 10"/> / <xsl:value-of select="field[@name='systemName']/@value"/><br/>
												</xsl:when>
											</xsl:choose>
										</xsl:otherwise>
									</xsl:choose>
								</xsl:for-each>
							</td>	
							<td>
								<xsl:for-each select="/*/item[@name='powers']/creditsSpend/item[field[@name='startWeek']/@value = $week]">
									<xsl:value-of select="field[@name='quantitySumm']/@value"/> Cr.<br/>
								</xsl:for-each>
							</td>	
						</tr>
					</xsl:for-each>
				</tbody>
				
			</table>

		
		</div>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_missions">
		<xsl:variable name="lang"><xsl:value-of select="$root"/><xsl:if test="$politic = 'suffix' and $default != 'true'">/<xsl:value-of select="$suffix"/></xsl:if></xsl:variable>
		<div><h3><xsl:value-of select="field[@name='pilotName']/@value"/></h3></div>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th rowspan="2">Complete Time</th>
						<th rowspan="2">Mission type</th>
						<th colspan="2">Location</th>
						<th colspan="3">Reward</th>
					</tr>
					<tr>
						<th colspan="2">Fraction</th>
						<th>Credits</th>
						<th>Commodities</th>
						<th>Materials</th>
					</tr>
				</thead>
				<tbody>
					<xsl:for-each select="childs/item">
						<tr>
							<td rowspan="2"><xsl:value-of select="field[@name='completeDate']/@value"/></td>
							<td rowspan="2"><xsl:value-of select="field[@name='missionTypeName']/@value"/></td>
							<td><xsl:value-of select="field[@name='systemName']/@value"/></td>
							<td><xsl:value-of select="field[@name='stationName']/@value"/></td>
							<td rowspan="2"><xsl:value-of select="field[@name='reward']/@value"/></td>
							<td rowspan="2">
								<xsl:for-each select="field[@name='commodityId']/value">
									<xsl:variable name="id" select="@value"/>
									<xsl:value-of select="/item/additionOne/item[field[@name='commodityId']/@value = $id]/field[@name='commodityName']/@value"></xsl:value-of><br/>
								</xsl:for-each>
							</td>
							<td rowspan="2">
								<xsl:for-each select="field[@name='materialId']/value">
									<xsl:variable name="id" select="@value"/>
									<xsl:value-of select="i10n:tr(/item/additionTwo/item[field[@name='materialId']/@value = $id]/field[@name='materialUniq']/@value)"></xsl:value-of><br/>
								</xsl:for-each>
							</td>
						</tr>
						<tr>
							<td colspan="2"><xsl:value-of select="field[@name='factionName']/@value"/></td>
						</tr>
					</xsl:for-each>
				</tbody>
			</table>			
		<div>
		</div>
	</xsl:template>
<!--
//
//
//
-->
	<xsl:template name="view_locations1">

		<div class="clearfix"></div>
		<!-- Location -->
		<div class="x_panel">
			<div class="x_title">
				<h2>
					<xsl:value-of select="i10n:tr('Systems Path')"/>
					<small></small>
				</h2>
				<div class="clearfix"></div>
			</div>
			<div class="x_content">
				<table id="table-system-path" class="table table-striped table-bordered">
                      <thead>
                        <tr>
                          <th>Time</th>
                          <th>Name</th>
                          <th>Position</th>
                          <th>Distance</th>
                        </tr>
                      </thead>
				</table>
			</div>
		</div>
		<script>
			$(function() {
			
				var pilot = '<xsl:value-of select="$pilot"/>';
			
				$('#table-system-path').DataTable({
					ajax: {
						url: site_root + '/ajax/pilots/'+ pilot + '/systems/',
						"dataSrc": "systems",
					},
					"columns": [
						{ "data": "timestamp" },
						{ "data": "systemName" },
						{ "data": "position" },
						{ "data": "distance" },
					],
					/* 
					deferRender: true,
					scrollY: 380,
					scrollCollapse: true,
					scroller: true
					*/
				});				
			});
		</script>
	</xsl:template>	
<!--
//
//
//
-->
	<xsl:template name="view_locations">

		<div class="clearfix"></div>
		<!-- Location -->
		<div class="x_panel">
			<div class="x_title">
				<h2>
					<xsl:value-of select="i10n:tr('Systems Path')"/>
					<small></small>
				</h2>
				<div class="filter">
					<div id="select-date-end" class="pull-right data" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
						<input id="end-date-selected" class="form-control hidden" type="text" style="border:none;" value="{/*/@end_date}"/>
						<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
						<span style="padding-left: 5px; padding-right: 5px;"></span>
						<b class="caret"></b>
					</div>
					<div class="pull-right data" style="background: #fff; cursor: pointer; padding: 5px 10px;">
						-
					</div>
					<div id="select-date-start" class="pull-right data" style="background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #ccc">
						<input id="start-date-selected" class="form-control hidden" type="text" style="border:none;" value="{/*/@start_date}"/>
						<i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
						<span style="padding-left: 5px; padding-right: 5px;"></span>
						<b class="caret"></b>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="x_content ">
				<table class="table table-striped table-bordered">
	                <thead>
	                  <tr>
	                    <th>Time</th>
	                    <th>Name</th>
	                    <th>Position</th>
	                    <th>Distance</th>
	                  </tr>
	                </thead>
	                <tbody id="locations-content">
						<tr class="sceleton hidden">
							<td class="star-time"></td>
							<td class="star-name"></td>
							<td class="star-coord"></td>
							<td class="star-distance"></td>
						</tr>
	                </tbody>
				</table>
			</div>
		</div>
		<script>
			$(function() {
			
				var pilot = '<xsl:value-of select="$pilot"/>';
				var updateLocations = function() {
					var data = {
						startdate: start_date.format('YYYY-MM-DD'),
						enddate: end_date.format('YYYY-MM-DD'),
					};
					proxy.makeCall('post', '/ajax/pilots/'+ pilot + '/systems/', null, null, data, function(result) {
						if (result.systems) {
							$('#locations-content').find('.locations').remove();
							result.systems.forEach(function(system) {
								var elem = $('.sceleton').clone();
								elem.addClass('locations');
								elem.removeClass('sceleton');
								elem.removeClass('hidden');
								$('.star-name', elem).html(system.systemName);
								$('.star-coord', elem).html(system.position);
								$('.star-time', elem).html(system.timestamp);
								$('.star-distance', elem).html(system.distance);
								$(elem).appendTo('#locations-content');
							});
						}
						
					});
				}
				
				//
				var start_date = moment(Date.parse("<xsl:value-of select="/*/@start_date"/>").getTime());
				var end_date = moment(Date.parse("<xsl:value-of select="/*/@end_date"/>").getTime());
				
				var setStartDateLabel = function() {
					$("#select-date-start").find("span").html(start_date.format('DD MMMM YYYY'));
				}
				 
				var setEndDateLabel = function() {
					$("#select-date-end").find("span").html(end_date.format('DD MMMM YYYY'));
				} 
				
				setStartDateLabel();
				setEndDateLabel();
				
				$("#select-date-start").datetimepicker({
					format: "YYYY-MM-DD",
                	viewMode: 'days',
                	
                	viewDate: start_date,
					maxDate: end_date,
					minDate: "<xsl:value-of select="/*/@mindate"/>",
            	}).on('dp.change', function(e) {
            		start_date = moment(e.date);
					setStartDateLabel();
					updateLocations();
            	});
				
            	$("#select-date-start").on('click', function() {
            		$("#select-date-start").data("DateTimePicker").viewDate(start_date);
            		//$("#select-date-start").data("DateTimePicker").viewMode('days');
            		$("#select-date-start").data("DateTimePicker").toggle();
            	});
				
				$("#select-date-end").datetimepicker({
					format: "YYYY-MM-DD",
                	viewMode: 'days',
                	viewDate: end_date,
					maxDate: "<xsl:value-of select="/*/@maxdate"/>",
					minDate: start_date,
            	}).on('dp.change', function(e) {
            		end_date = moment(e.date);
					setEndDateLabel();
					updateLocations();
            	});
				
            	$("#select-date-end").on('click', function() {
            		//$("#select-date-end").data("DateTimePicker").viewMode('days');
            		$("#select-date-end").data("DateTimePicker").toggle();
            	});
				
				updateLocations();
			});
		</script>
	</xsl:template>
<!--
//
//
//
-->
</xsl:stylesheet>