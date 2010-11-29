package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LotMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LotMstr
 * @author MyEclipse Persistence Tools
 */

public class LotMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LotMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LotMstr transientInstance) {
		log.debug("saving LotMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LotMstr persistentInstance) {
		log.debug("deleting LotMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LotMstr findById(com.gopawpaw.erp.hibernate.l.LotMstrId id) {
		log.debug("getting LotMstr instance with id: " + id);
		try {
			LotMstr instance = (LotMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LotMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LotMstr instance) {
		log.debug("finding LotMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding LotMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LotMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LotMstr instances");
		try {
			String queryString = "from LotMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LotMstr merge(LotMstr detachedInstance) {
		log.debug("merging LotMstr instance");
		try {
			LotMstr result = (LotMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LotMstr instance) {
		log.debug("attaching dirty LotMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LotMstr instance) {
		log.debug("attaching clean LotMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LotMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LotMstrDAO) ctx.getBean("LotMstrDAO");
	}
}