package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SeqMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SeqMstr
 * @author MyEclipse Persistence Tools
 */

public class SeqMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SeqMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SeqMstr transientInstance) {
		log.debug("saving SeqMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SeqMstr persistentInstance) {
		log.debug("deleting SeqMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SeqMstr findById(com.gopawpaw.erp.hibernate.s.SeqMstrId id) {
		log.debug("getting SeqMstr instance with id: " + id);
		try {
			SeqMstr instance = (SeqMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SeqMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SeqMstr instance) {
		log.debug("finding SeqMstr instance by example");
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
		log.debug("finding SeqMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SeqMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SeqMstr instances");
		try {
			String queryString = "from SeqMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SeqMstr merge(SeqMstr detachedInstance) {
		log.debug("merging SeqMstr instance");
		try {
			SeqMstr result = (SeqMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SeqMstr instance) {
		log.debug("attaching dirty SeqMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SeqMstr instance) {
		log.debug("attaching clean SeqMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SeqMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SeqMstrDAO) ctx.getBean("SeqMstrDAO");
	}
}