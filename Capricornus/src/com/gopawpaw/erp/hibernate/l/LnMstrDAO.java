package com.gopawpaw.erp.hibernate.l;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * LnMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.l.LnMstr
 * @author MyEclipse Persistence Tools
 */

public class LnMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(LnMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(LnMstr transientInstance) {
		log.debug("saving LnMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(LnMstr persistentInstance) {
		log.debug("deleting LnMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public LnMstr findById(com.gopawpaw.erp.hibernate.l.LnMstrId id) {
		log.debug("getting LnMstr instance with id: " + id);
		try {
			LnMstr instance = (LnMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.l.LnMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(LnMstr instance) {
		log.debug("finding LnMstr instance by example");
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
		log.debug("finding LnMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from LnMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all LnMstr instances");
		try {
			String queryString = "from LnMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public LnMstr merge(LnMstr detachedInstance) {
		log.debug("merging LnMstr instance");
		try {
			LnMstr result = (LnMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(LnMstr instance) {
		log.debug("attaching dirty LnMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(LnMstr instance) {
		log.debug("attaching clean LnMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static LnMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (LnMstrDAO) ctx.getBean("LnMstrDAO");
	}
}